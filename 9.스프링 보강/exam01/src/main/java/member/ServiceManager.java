package member;

/**
 * 객체 조립기, 객체 컨테이너
 *
 */
public class ServiceManager {

    public MemberDao memberDao() {
        return new CachedMemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public LoginValidator loginValidator() {
        return new LoginValidator();
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }

    public LoginService loginService() {
        return new LoginService(loginValidator(), memberDao());
    }
}
