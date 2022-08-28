package clone.library.presentation.reservation;

import clone.library.application.scenario.ReservationScenario;
import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.presentation.reservation.response.EntryResponse;
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
 * 予約の登録
 */
@Slf4j
@RestController
@RequestMapping("reservation/register")
public class ReservationController {

    ReservationScenario reservationScenario;

    @Autowired
    ReservationController(ReservationScenario reservationScenario) {
        this.reservationScenario = reservationScenario;
    }

    @GetMapping("/{entryNumber}")
    ResponseEntity<Object> reservationForm(@PathVariable final EntryNumber entryNumber) {
        log.info("entryNumber:{}", entryNumber);

        val entry = reservationScenario.findMaterial(entryNumber);
        return ResponseEntity.status(HttpStatus.OK).body(new EntryResponse(entry));
    }


}
