package main;

import models.member.JoinService;
import models.member.JoinValidator;
import models.member.MemberDao;
import models.member.ServiceManager;

public class Ex01 {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();
        JoinService joinService = manager.joinService();
    }
}
