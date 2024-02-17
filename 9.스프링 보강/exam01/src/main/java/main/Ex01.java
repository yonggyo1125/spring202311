package main;

import member.*;

public class Ex01 {
    public static void main(String[] args) {
        ServiceManager serviceManager = new ServiceManager();
        JoinService joinService = serviceManager.joinService();
        LoginService loginService = serviceManager.loginService();

        /*
        JoinValidator validator = new JoinValidator();
        MemberDao memberDao = new MemberDao();
        JoinService joinService = new JoinService(validator, memberDao);

        //System.out.println(joinService); // joinService.toString();
        LoginValidator loginValidator = new LoginValidator();
        LoginService loginService = new LoginService(loginValidator, memberDao);
         */

    }
}
