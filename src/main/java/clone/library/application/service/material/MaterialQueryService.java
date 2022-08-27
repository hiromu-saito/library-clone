package clone.library.application.service.material;

import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 資料の参照と検索
 */
@Service
public class MaterialQueryService {

    MaterialRepository materialRepository;

    @Autowired
    MaterialQueryService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }


    /**
     * キーワードで本を探す
     */
    public Entries search(final Keyword keyword) {
        return materialRepository.search(keyword);
    }
}
