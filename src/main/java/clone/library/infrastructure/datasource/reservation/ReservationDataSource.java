package clone.library.infrastructure.datasource.reservation;

import clone.library.application.service.reservation.ReservationRepository;
import clone.library.domain.model.reservation.ReservationRequest;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReservationDataSource implements ReservationRepository {

    ReservationDao reservationDao;

    @Autowired
    ReservationDataSource(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    @Override
    @Transactional
    public void reserve(final ReservationRequest reservationRequest) {
        val reservationNumber = reservationDao.nextNumber();

        reservationDao.insertReservation(reservationNumber, reservationRequest.entryNumber());

        reservationDao.insertNotPrepared(reservationNumber);

    }
}
