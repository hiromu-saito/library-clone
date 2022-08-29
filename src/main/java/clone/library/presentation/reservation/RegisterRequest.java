package clone.library.presentation.reservation;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.ToString;

@JsonNaming
@Getter
@ToString
public class RegisterRequest {

    int entryNumber;

    int memberNumber;
}
