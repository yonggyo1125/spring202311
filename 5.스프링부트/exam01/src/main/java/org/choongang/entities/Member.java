package org.choongang.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
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
