package clone.library.domain.model.reservation;


import lombok.ToString;
import org.seasar.doma.Domain;

@Domain(valueType = Integer.class, accessorMethod = "value")
@ToString
public class ReservationNumber {

    final int value;

    ReservationNumber(final Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }
}
