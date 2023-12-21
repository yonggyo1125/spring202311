package org.choongang.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Member {
    @Id // Primary Key : 기본키
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
