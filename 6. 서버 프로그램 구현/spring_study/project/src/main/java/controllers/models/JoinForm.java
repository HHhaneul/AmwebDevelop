package controllers.models;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinForm {
    @NotBlank
    private String userId;

    @NotBlank
    @Size(min=8)
    private String userPw;

    @NotBlank
    private String userPwRe;

    @NotBlank
    private String userNm;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String mobile;

    @AssertTrue
    private boolean agree;
}
