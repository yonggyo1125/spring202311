package models.member;

public class JoinService {

    private JoinValidator validator;
    private MemberDao memberDao;


    public JoinService(JoinValidator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    /**
     * 회원 가입
     *  - Member member : DTO(Data Transfer Object)
     *  - JoinValidator : 전달된 데이터 검증
     *  - MemberDao : 데이터를 영구 보관(DAO - Data Access Object)
     * @param member
     */
    public void join(Member member) {

        validator.check(member);

        memberDao.save(member);
    }
}
