package clone.library.infrastructure.datasource.member;

import clone.library.application.service.member.MemberRepository;
import clone.library.domain.model.member.MemberNumber;
import clone.library.domain.model.member.MemberStatus;
import lombok.val;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDataSource implements MemberRepository {

    MemberDao memberDao;

    MemberDataSource(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public MemberStatus status(final MemberNumber memberNumber) {
        val exist = memberDao.exists(memberNumber);
        return exist ? MemberStatus.VALID : MemberStatus.NOT_REGISTER;
    }
}
