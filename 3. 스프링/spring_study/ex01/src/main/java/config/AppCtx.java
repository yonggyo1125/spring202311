package config;

import models.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// DI -> 필요한 부서(소스)에 객체를 제공
@Configuration // 설정 클래스 역할 ? 스프링 컨테이너가 관리 할 객체를 알려주는 설정 // 관리 -> 사용
public class AppCtx {
    @Bean
    public Greeter greeter() {
        return new Greeter();
    }
}
