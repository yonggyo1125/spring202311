package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "SPRING6";
        String password = "_aA123456";

        String sql= "INSERT INTO MEMBER (USER_NO, USER_ID, USER_PW, USER_NM, EMAIL) " +
                    " VALUES (SEQ_MEMBER.nextval, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "USER02");
            pstmt.setString(2, "123456");
            pstmt.setString(3, "사용자02");
            pstmt.setString(4, "user02@test.org");

            int result = pstmt.executeUpdate();
            System.out.println(result);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
