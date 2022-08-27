package clone.library.presentation.reservation;

import clone.library.application.scenario.ReservationScenario;
import clone.library.domain.model.material.entry.Keyword;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所蔵品目の検索
 */
@RestController
@RequestMapping("reservation/entries")
@Slf4j
public class EntitySearchController {

    ReservationScenario reservationScenario;

    @Autowired
    EntitySearchController(ReservationScenario reservationScenario) {
        this.reservationScenario = reservationScenario;
    }

    @GetMapping("/search/{keyword}")
    public ResponseEntity<Object> search(@PathVariable final Keyword keyword) {
        log.info("entryName:{}", keyword);
        val body = reservationScenario.search(keyword);
        return ResponseEntity.status(HttpStatus.OK).body(new EntriesResponse(body));
    }
}
