package jdbctest;

import config.AppCtx;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= AppCtx.class)
public class JdbcTemplateTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("DataSource를 통한 DB 연결 테스트")
    void connectionTest() {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    @DisplayName("INSERT 테스트")
    void insertTest() {
        // DataAccessException - RuntimeException - 예외처리 X -> 실행

        String sql = "INSERT INTO MEMBER (USER_NO, USER_ID, USER_PW, USER_NM, EMAIL) " +
                " VALUES (SEQ_MEMBER.nextval, ?, ?, ?, ?)";
        int affectedRows = jdbcTemplate.update(sql,
                "USER101", "123456", "사용자101", "user101@test.org");

        System.out.println(affectedRows);
    }
}
