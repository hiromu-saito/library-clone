package clone.library.presentation.reservation.response;

import clone.library.domain.model.material.entry.Entry;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

@JsonNaming
@Getter
public class EntryResponse {
    int entryNumber;
    String title;
    String workOf;
    String entryType;

    public EntryResponse(Entry entry) {
        entryNumber = entry.getEntryNumber().value();
        title = entry.getTitle().value();
        workOf = entry.getWorkOf().value();
        entryType = entry.getEntryType().value();
    }
}
