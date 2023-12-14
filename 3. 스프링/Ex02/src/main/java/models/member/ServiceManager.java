package models.member;

public class ServiceManager {
    public MemberDao memberDao() {
        return new CachedMemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }
}
