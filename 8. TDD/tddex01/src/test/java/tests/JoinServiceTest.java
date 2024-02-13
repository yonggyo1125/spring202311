package tests;

import member.service.BadRequestException;
import member.service.JoinService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {
    
    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccess() {
        JoinService joinService = new JoinService();

        assertDoesNotThrow(() -> {
            joinService.join();
        });
    }

    @Test
    @DisplayName("필수 입력항목(userId, userPw, confirmPw, userNm) 검증, 실패시에는 BadRequestException 발생")
    void requiredField() {
        JoinService joinService = new JoinService();
        assertThrows(BadRequestException.class, () -> {
            joinService.join(member);
        });
    }
}
