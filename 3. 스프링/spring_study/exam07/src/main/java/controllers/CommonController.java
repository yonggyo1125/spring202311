package controllers;

import commons.CommonException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers")
public class CommonController {
    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model) {

        if (e instanceof CommonException) {

        }

        e.printStackTrace();

        model.addAttribute("message", e.getMessage());

        return "error/common";
    }
}
