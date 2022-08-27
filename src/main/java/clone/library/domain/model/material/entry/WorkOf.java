package clone.library.domain.model.material.entry;

import org.seasar.doma.Domain;

/**
 * 著者・アーティスト
 */
@Domain(valueType = String.class, factoryMethod = "of", accessorMethod = "value")
public class WorkOf {
    final String value;

    public WorkOf(String value) {
        this.value = value;
    }

    public static WorkOf of(final String value) {
        return new WorkOf(value);
    }

    public String value() {
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }
}
