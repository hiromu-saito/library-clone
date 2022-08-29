package clone.library.application.service.member;

import clone.library.domain.model.member.MemberNumber;
import clone.library.domain.model.member.MemberStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberQueryService {

    MemberRepository memberRepository;

    @Autowired
    MemberQueryService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 会員登録の状態を確認する
     */
    public MemberStatus status(final MemberNumber memberNumber) {
        return memberRepository.status(memberNumber);
    }
}
