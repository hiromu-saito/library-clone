package clone.library.infrastructure.datasource.member;

import clone.library.domain.model.member.MemberNumber;
import clone.library.domain.model.reservation.ReservationNumber;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface MemberDao {

    @Insert(sqlFile = true)
    int insertReservationAndMember(final MemberNumber memberNumber, final ReservationNumber reservationNumber);

    @Select
    boolean exists(final MemberNumber memberNumber);
    //firstcommit
    //firstcommit
}
