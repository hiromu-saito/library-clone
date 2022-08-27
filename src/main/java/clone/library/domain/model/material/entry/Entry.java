package clone.library.domain.model.material.entry;

import clone.library.domain.model.material.instock.StockQuantity;
import lombok.Getter;
import org.seasar.doma.Entity;

/**
 * 所蔵品目と在庫数
 */
@Entity(immutable = true)
@Getter
public class Entry {
    final EntryNumber entryNumber;
    final Title title;
    final WorkOf workOf;
    final EntryType entryType;
    final StockQuantity stockQuantity;

    public Entry(EntryNumber entryNumber, Title title, WorkOf workOf, EntryType entryType, StockQuantity stockQuantity) {
        this.entryNumber = entryNumber;
        this.title = title;
        this.workOf = workOf;
        this.entryType = entryType;
        this.stockQuantity = stockQuantity;
    }
}
