package tests;

import configs.MvcConfig;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration(classes = MvcConfig.class)
public class JoinServiceTest {

    @Autowired
    private DataSource dataSrouce;
    
    @Test
    @DisplayName("데이터베이스 연결 테스트")
    void connectionTest() {
        
    }
}
