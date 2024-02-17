package main;

import configs.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("configs");
    }
}
