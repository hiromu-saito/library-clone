package clone.library.application.service.member;


import clone.library.domain.model.member.MemberNumber;
import clone.library.domain.model.member.MemberStatus;

public interface MemberRepository {

    MemberStatus status(final MemberNumber memberNumber);

}
