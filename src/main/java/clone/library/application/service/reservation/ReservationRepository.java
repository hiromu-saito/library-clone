package clone.library.application.service.reservation;

import clone.library.domain.model.reservation.ReservationRequest;

/**
 * 予約リポジトリ
 */
public interface ReservationRepository {

    void reserve(ReservationRequest reservationRequest);
}
