package clone.library.infrastructure.datasource.reservation;

import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.reservation.ReservationNumber;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface ReservationDao {

    @Select
    ReservationNumber nextNumber();

    @Insert(sqlFile = true)
    int insertReservation(final ReservationNumber reservationNumber,
                          final EntryNumber entryNumber);

    @Insert(sqlFile = true)
    int insertNotPrepared(final ReservationNumber reservationNumber);
}
