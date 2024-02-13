package tests;

import lombok.Builder;
import member.controllers.Member;
import member.service.BadRequestException;
import member.service.JoinService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    @BeforeAll // 모든 테스트 케이스 실행전 1번 실행
    static void beforeAll() {
        System.out.println("BEFORE ALL");
    }

    @AfterAll // 모든 테스트 케이스 실행 완료 후 1번 실행
    static void afterAll() {
        System.out.println("AFTER ALL");
    }

    @BeforeEach // 각각의 테스트 케이스 실행 전 호출
    void beforeEach() {
        System.out.println("BEFORE EACH");
    }

    @AfterEach // 각각의 테스트 케이스 실행 후 호출
    void afterEach() {
        System.out.println("AFTER EACH");
    }

    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccess() {
        System.out.println("joinSuccess");
        JoinService joinService = new JoinService();
        Member member = Member.builder().build();
        assertDoesNotThrow(() -> {
            joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수 입력항목(userId, userPw, confirmPw, userNm) 검증, 실패시에는 BadRequestException 발생")
    void requiredField() {
        System.out.println("requiredField");
        JoinService joinService = new JoinService();
        assertThrows(BadRequestException.class, () -> {
            Member member = Member.builder()
                            .userPw("123456")
                            .confirmPw("123456")
                            .userNm("사용자01")
                            .build();

            joinService.join(member);
        });
    }
}
