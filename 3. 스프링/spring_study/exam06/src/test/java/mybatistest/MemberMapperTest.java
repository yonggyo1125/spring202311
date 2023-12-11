package mybatistest;

import config.AppCtx;
import mapper.MemberMapper;
import models.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class MemberMapperTest {

    @Autowired
    private MemberMapper mapper;
    
    @Test
    @DisplayName("회원 목록 조회 테스트")
    void memberListTest() {
        List<Member> members = mapper.getMembers();
        for (Member member : members) {
            System.out.println(member);
        }

        System.out.println(mapper.getClass().getName());
    }

    @Test
    @DisplayName("회원 추가 테스트")
    void memberInsertTest() {
         Member member = Member.builder()
                 .userId("USER202")
                 .userPw("123456")
                 .userNm("사용자202")
                 .email("user202@test.org")
                 .build();

         int affectedRow = mapper.register(member);
         System.out.println(affectedRow);
    }
}
