package controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminMemberController")
@RequestMapping("/admin/member")
public class MemberController {

    @GetMapping  // /admin/member
    public String index() {

        return "admin/member/list";
    }

}
