package clone.library.application.scenario;

import clone.library.application.service.material.MaterialQueryService;
import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 予約受付シナリオ
 */
@Service
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
}
