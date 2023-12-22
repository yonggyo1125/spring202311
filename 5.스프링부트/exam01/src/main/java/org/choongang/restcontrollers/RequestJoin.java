package org.choongang.restcontrollers;

import lombok.Data;

@Data
public class RequestJoin {
    private String userId;
    private String userPw;
    private String confirmPw;
    private String userNm;
    private String email;
}