package clone.library.presentation.reservation.request;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

@JsonNaming
@Getter
public class RegisterRequest {

    private int entryNumber;

    private int memberNumber;
}
