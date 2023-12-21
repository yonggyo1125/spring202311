package org.choongang.tests;

import org.choongang.entities.Member;
import org.choongang.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class JdbcEx01 {

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>)repository.findAll();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        Member member = Member.builder()
                .userNo(18L)
                .userNm("(수정)사용자01")
                .modDt(LocalDateTime.now())
                .build();

        repository.save(member);
    }
}
