package member;

import commons.Validator;

public class JoinService {

    private Validator validator;
    private MemberDao memberDao;

    public JoinService(Validator<Member> validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void join(Member member) {
        validator.check(member); // 데이터 검증

        memberDao.register(member); // DB에 영구 저장

    }
}
