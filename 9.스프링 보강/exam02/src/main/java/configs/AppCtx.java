package configs;

import member.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    @Bean
    public LoginValidator loginValidator() {
        return new LoginValidator();
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }

    @Bean
    public LoginService loginService() {
        return new LoginService(loginValidator(), memberDao());
    }
}
