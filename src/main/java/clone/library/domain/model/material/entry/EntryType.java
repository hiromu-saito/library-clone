package clone.library.domain.model.material.entry;

import org.seasar.doma.Domain;

/**
 * 所蔵品目種別
 * <p>
 * 図書と視聴覚資料(DVD等)ごとに貸出可能数が異なる
 */

@Domain(valueType = String.class, factoryMethod = "of", accessorMethod = "value")
public enum EntryType {
    BOOK("0", "図書"),
    AUDIBLE("1", "視聴覚資料");

    private final String value;
    private final String name;

    EntryType(final String value, final String name) {
        this.value = value;
        this.name = name;
    }

    public static EntryType of(final String value) {
        for (EntryType entryType : EntryType.values()) { //拡張for文による走査
            if (entryType.value.equals(value)) {
                return entryType;                 //条件に一致するインスタンスを返す
            }
        }
        return null;
    }

    public String value() {
        return this.value;
    }

}
