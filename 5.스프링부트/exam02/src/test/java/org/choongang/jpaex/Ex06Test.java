package org.choongang.jpaex;

import org.choongang.entities.BoardData;
import org.choongang.entities.Member;
import org.choongang.repositories.BoardDataRepository;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex06Test {

    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private MemberRepository memberRepository;


    @BeforeEach
    void init() {
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setName("사용자01");
        member.setPassword("12345678");

        memberRepository.saveAndFlush(member);

        BoardData data = new BoardData();
        data.setSubject("제목1");
        data.setContent("내용1");
        data.setMember(member);

        boardDataRepository.saveAndFlush(data);
    }
}
