package clone.library.application.scenario;

import clone.library.application.service.material.MaterialQueryService;
import clone.library.application.service.reservation.ReservationRecordService;
import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Entry;
import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.material.entry.Keyword;
import clone.library.domain.model.reservation.ReservationRequest;
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
    ReservationRecordService reservationRecordService;

    @Autowired
    ReservationScenario(MaterialQueryService materialQueryService, ReservationRecordService reservationRecordService) {
        this.materialQueryService = materialQueryService;
        this.reservationRecordService = reservationRecordService;
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

    /**
     * 予約を記録する
     */
    public void reserve(final ReservationRequest reservationRequest) {
        val entryOpt = materialQueryService.findMaterial(reservationRequest.entryNumber());
        entryOpt.orElseThrow(() -> {
            log.warn("所蔵品が見つかりませんでした。所蔵品目番号:{}", reservationRequest.entryNumber().value());
            // TODO　例外処理
            return new RuntimeException();
        });

        reservationRecordService.reserve(reservationRequest);
    }
}