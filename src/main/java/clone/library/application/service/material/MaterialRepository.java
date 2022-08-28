package clone.library.application.service.material;

import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Entry;
import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.material.entry.Keyword;

import java.util.Optional;

/**
 * 本リポジトリ
 */
public interface MaterialRepository {

    Entries search(Keyword keyword);

    Optional<Entry> findMaterial(final EntryNumber entryNumber);
}
