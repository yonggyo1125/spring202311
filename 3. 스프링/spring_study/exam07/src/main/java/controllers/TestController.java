package controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/cookie/test1")
    public String test1(HttpServletResponse response, HttpServletRequest request) {
        Cookie cookie = new Cookie("key1", "value1");
        response.addCookie(cookie);

        Cookie cookie2 = new Cookie("key2", "value2");
        cookie2.setPath(request.getContextPath()); // /exam07
        response.addCookie(cookie);

        return "test";
    }

    @GetMapping("/cookie1/test2")
    public String test2() {

        return "test";
    }
}
