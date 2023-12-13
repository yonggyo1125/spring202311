package main;

import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // AppCtx.class -> Class 객체 : AppCtx 클래스의 정보가 담겨 있는 객체
        //

    }
}
