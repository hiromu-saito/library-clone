package clone.library.infrastructure.datasource.reservation;

import clone.library.application.service.reservation.ReservationRepository;
import clone.library.domain.model.reservation.ReservationRequest;
import clone.library.infrastructure.datasource.member.MemberDao;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReservationDataSource implements ReservationRepository {

    ReservationDao reservationDao;

    MemberDao memberDao;

    @Autowired
    ReservationDataSource(ReservationDao reservationDao, MemberDao memberDao) {
        this.reservationDao = reservationDao;
        this.memberDao = memberDao;
    }

    @Override
    @Transactional
    public void reserve(final ReservationRequest reservationRequest) {
        val reservationNumber = reservationDao.nextNumber();

        memberDao.insertReservationAndMember(reservationRequest.memberNumber(), reservationNumber);

        reservationDao.insertReservation(reservationNumber, reservationRequest.entryNumber());

        reservationDao.insertNotPrepared(reservationNumber);

    }
}
