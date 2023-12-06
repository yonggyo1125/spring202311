package models.member;

public class ServiceManager {
    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator(memberDao());
    }

    public JoinService joinService() {
        return new JoinService(memberDao(), joinValidator());
    }

    public ListService listService() {
        ListService listService = new ListService();
        listService.setMemberDao(memberDao());

        return listService;
    }
}
