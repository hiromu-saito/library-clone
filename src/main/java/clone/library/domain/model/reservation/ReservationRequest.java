package clone.library.domain.model.reservation;

import clone.library.domain.model.material.entry.EntryNumber;
import clone.library.domain.model.member.MemberNumber;


public class ReservationRequest {

    MemberNumber memberNumber;

    EntryNumber entryNumber;

    public ReservationRequest(final int memberNumber, final int entryNumber) {
        this.memberNumber = new MemberNumber(memberNumber);
        this.entryNumber = new EntryNumber(entryNumber);
    }

    public MemberNumber memberNumber() {
        return this.memberNumber;
    }

    public EntryNumber entryNumber() {
        return this.entryNumber;
    }
}
