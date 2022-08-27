package clone.library.domain.model.material.entry;

import org.seasar.doma.Domain;

/**
 * 所蔵品目の題名
 */
@Domain(valueType = String.class, factoryMethod = "of", accessorMethod = "value")
public class Title {
    final String value;

    public Title(final String value) {
        this.value = value;
    }

    public static Title of(final String value) {
        return new Title(value);
    }

    public String value() {
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }
}
