package main;

import aopex.RecCalculator;
import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        RecCalculator cal = ctx.getBean(RecCalculator.class);
        long result = cal.factorial(10L);
        System.out.printf("cal : %d%n", result);

        ctx.close();
    }
}
