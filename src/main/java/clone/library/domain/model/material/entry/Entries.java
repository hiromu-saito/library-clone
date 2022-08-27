package clone.library.domain.model.material.entry;

import lombok.Getter;

import java.util.List;

/**
 * 所蔵品目のリスト
 */
@Getter
public class Entries {
    List<Entry> list;

    public Entries(List<Entry> list) {
        this.list = list;
    }


}
