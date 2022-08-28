package clone.library.application.scenario;

import clone.library.application.service.material.MaterialQueryService;
import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Entry;
import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.material.entry.Keyword;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 予約受付シナリオ
 */
@Service
@Slf4j
public class ReservationScenario {
    MaterialQueryService materialQueryService;

    @Autowired
    ReservationScenario(MaterialQueryService materialQueryService) {
        this.materialQueryService = materialQueryService;
    }

    /**
     * 所蔵品を探す
     */
    public Entries search(final Keyword keyWord) {
        return materialQueryService.search(keyWord);
    }

    /**
     * 所蔵品を見つける
     */
    public Entry findMaterial(final EntryNumber entryNumber) {
        val materialOpt = materialQueryService.findMaterial(entryNumber);
        return materialOpt.orElseThrow(() -> {
            log.warn("所蔵品が見つかりませんでした。所蔵品目番号:{}", entryNumber.value());
            // TODO　例外処理
            return new RuntimeException();
        });
    }
}