package controllers.admin;

import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("adminMemberController")
@RequestMapping("/admin/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberDao memberDao;

    @GetMapping  // /admin/member
    public String index(@ModelAttribute MemberSearch search, Errors errors, Model model) {

        List<Member> members = memberDao.getList(search);
        model.addAttribute("members", members);

        members.forEach(System.out::println);

        return "admin/member/list";
    }

    // /admin/member/회원아이디

    @GetMapping("/{id}")
    public String info(@PathVariable("id") String userId) {

        System.out.println(userId);

        return "admin/member/info";
    }

    @GetMapping("/test")
    public String errorTest() {
        boolean result = true;
        if (result) {
            throw new RuntimeException("예외 발생!!!!");
        }

        return "admin/member/info";
    }
}
