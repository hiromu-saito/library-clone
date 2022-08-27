package clone.library.domain.model.material.entry;

import com.sun.istack.NotNull;
import org.seasar.doma.Domain;

/**
 * 検索キーワード
 */
@Domain(valueType = String.class, accessorMethod = "value")
public class Keyword {
    @NotNull
    final String value;

    public Keyword(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }
}
