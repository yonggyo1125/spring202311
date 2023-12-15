package controllers.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class RequestJoin {
    @NotBlank
    private String userId;

    @NotBlank
    private String userPw;

    @NotBlank
    private String confirmPw;

    @NotBlank
    private String userNm;
    private String email;

    private boolean agree;
}
