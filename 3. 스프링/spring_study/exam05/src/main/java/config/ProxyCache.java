package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCache {

    @Pointcut("execution(* aopex..*(long))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs(); // 매개변수로 투입된 인자 값( 예 - 10L)
        Long num = (Long)args[0];

        Object result = joinPoint.proceed();

        return result;
    }
}
