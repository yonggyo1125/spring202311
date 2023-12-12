package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name,
                        @RequestParam("num") int num) {
        System.out.println(name + "," + num);
        return "hello"; // /WEB-INF/templates/hello.jsp
    }

    /*
    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        // request.setAttribute("message", "안녕하세요.");
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("hello"); // /WEB-INF/templates/hello.jsp

        return mv;
    }
     */
}
