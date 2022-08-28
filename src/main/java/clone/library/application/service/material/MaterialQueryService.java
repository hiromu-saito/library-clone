package clone.library.application.service.material;

import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Entry;
import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.material.entry.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    /**
     * 所蔵品番号で所蔵品を探す
     */
    public Optional<Entry> findMaterial(final EntryNumber entryNumber) {
        return materialRepository.findMaterial(entryNumber);
    }
}
