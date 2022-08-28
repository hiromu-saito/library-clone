package clone.library.domain.model.material.entry;

import org.seasar.doma.Domain;

/**
 * 所蔵品目番号
 */
@Domain(valueType = Integer.class, accessorMethod = "value")
public class EntryNumber {
    final int value;

    public EntryNumber(final Integer value) {
        this.value = value;
    }

    public EntryNumber(final String value) {
        this.value = Integer.parseInt(value);
    }

    public Integer value() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
