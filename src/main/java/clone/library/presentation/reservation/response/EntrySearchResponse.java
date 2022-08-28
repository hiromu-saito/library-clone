package clone.library.presentation.reservation.response;

import clone.library.domain.model.material.entry.Entries;
import clone.library.domain.model.material.entry.Entry;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@JsonNaming
public class EntrySearchResponse {

    List<EntryResponse> entryResponseList;

    public EntrySearchResponse(Entries entries) {
        entryResponseList = entries.getList().stream()
                .map(EntryResponse::new)
                .collect(Collectors.toList());
    }

    @Getter
    @JsonNaming
    private static class EntryResponse {
        int entryNumber;
        String title;
        String workOf;
        String entryType;
        long stockQuantity;

        private EntryResponse(Entry entry) {
            entryNumber = entry.getEntryNumber().value();
            title = entry.getTitle().value();
            workOf = entry.getWorkOf().value();
            entryType = entry.getEntryType().value();
            stockQuantity = entry.getStockQuantity().value();
        }
    }
}
