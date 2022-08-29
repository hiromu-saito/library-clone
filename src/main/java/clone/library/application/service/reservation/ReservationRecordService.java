package clone.library.application.service.reservation;

import clone.library.domain.model.reservation.ReservationRequest;
import org.springframework.stereotype.Service;

/**
 * 予約記録サービス
 */
@Service
public class ReservationRecordService {

    ReservationRepository reservationRepository;

    ReservationRecordService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public void reserve(final ReservationRequest reservationRequest) {
        reservationRepository.reserve(reservationRequest);
    }
}
