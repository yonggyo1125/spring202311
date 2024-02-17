package member;

import commons.Validator;

public class LoginService {

    private Validator<RequestLogin> validator;
    private MemberDao memberDao;

    public LoginService(Validator<RequestLogin> validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void login(RequestLogin form) {
        validator.check(form);
        Member member = memberDao.get(form.getUserId());
        ///....
        System.out.println("로그인 완료...");
    }
}
