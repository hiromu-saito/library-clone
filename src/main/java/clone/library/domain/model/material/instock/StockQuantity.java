package clone.library.domain.model.material.instock;


import org.seasar.doma.Domain;

/**
 * 在庫数
 */
@Domain(valueType = Integer.class, accessorMethod = "value")
public class StockQuantity {

    private final int value;

    public StockQuantity(final Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

}
