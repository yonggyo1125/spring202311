package org.choongang.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.choongang.restcontrollers.RequestJoin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("회원 가입 성공시 응답 코드 201")
    void joinTest() throws Exception {
        // MediaType.APPLICATION_JSON == application/json

        RequestJoin form = new RequestJoin();
        form.setUserId("user01");
        form.setUserPw("12345678");
        form.setUserNm("사용자01");
        form.setEmail("user01@test.org");
        form.setRegDt(LocalDateTime.now());

        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        String body = om.writeValueAsString(form); // 자바 객체 -> JSON 문자열 변환

        System.out.println(body);

        mockMvc.perform(
                    post("/api/member")
                            //.header("Content-Type", "application/json")
                            .header("Content-Type", MediaType.APPLICATION_JSON)
                            .characterEncoding("UTF-8")
                            .content(body)
                )
                .andDo(print());
    }
}
