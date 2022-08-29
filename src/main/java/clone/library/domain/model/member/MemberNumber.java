package clone.library.domain.model.member;

import org.seasar.doma.Domain;

@Domain(valueType = Integer.class, accessorMethod = "value")
public class MemberNumber {
    final int value;

    public MemberNumber(final Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }
}
