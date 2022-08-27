package clone.library.application.service.material;

import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Keyword;

/**
 * 本リポジトリ
 */
public interface MaterialRepository {

    Entries search(Keyword keyword);
}
