package controllers.models;

import commons.validators.MobileValidator;
import lombok.RequiredArgsConstructor;
import models.members.MemberDao;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator, MobileValidator {

    private final MemberDao memberDao;

    @Override
    public boolean supports(Class<?> clazz) { // 검증하고자 하는 커맨드 객체 제한
        return clazz.isAssignableFrom(JoinForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) { // 유효성 검사 진행
        JoinForm joinForm = (JoinForm) target;
        /**
         * 1. 아이디 중복 여부 검사
         * 2. 비밀번호, 비밀번호 확인의 일치 여부
         * 3. 휴대전화 번호 형식 체크
         */
        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String mobile = joinForm.getMobile();

        /** 1. 아이디 중복 여부 검사 */
        if (memberDao.exists(userId)){
            errors.rejectValue("userId", "Duplicate");
        }

        /** 2. 비밀번호, 비밀번호 확인의 일치 여부 */
        if (!userPw.equals(userPwRe)){
            errors.rejectValue("userPwRe", "Incorrect.password");
        }

        /** 3. 휴대전화 번호 형식 체크 MobileValidator */
        if (mobile != null && !mobile.isBlank()) {
            boolean result = numberCheck(mobile);
            if (!result) {
                errors.rejectValue("mobile", "Incorrect.mobile.pattern");
            }
            mobile = mobile.replace("\\D", "");
            joinForm.setMobile(mobile);
        }

        /** 필수 항목 검증 */

        /*
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile", "Required");
        */

        /*
        필수 항목 검증
        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String userNm = joinForm.getUserNm();
        String email = joinForm.getEmail();
        String mobile = joinForm.getMobile();
        boolean agree = joinForm.isAgree();

        *//** 아이디 입력 여부 *//*
        if (userId == null || userId.isBlank()){
            errors.rejectValue("userId", "Required");
        }

        *//** 비밀번호 입력 여부 *//*
        if (userPw == null || userPw.isBlank()){
            errors.rejectValue("userPw", "Required");
        }

        *//** 비밀번호확인 입력 여부 *//*
        if (userPwRe == null || userPwRe.isBlank()){
            errors.rejectValue("userPwRe", "Required");
        }

        *//** 회원명 입력 여부 *//*
        if (userNm == null || userNm.isBlank()){
            errors.rejectValue("userNm", "Required");
        }

        *//** 이메일 입력 여부 *//*
        if (email == null || email.isBlank()){
            errors.rejectValue("email", "Required");
        }

        *//** 휴대전화번호 입력 여부 *//*
        if (mobile == null || mobile.isBlank()){
            errors.rejectValue("mobile", "Required");
        }

        *//** 공통 오류 발생 *//*
        boolean result = false;
        if (!result){
            errors.reject("testError", "공통 오류 발생!!");
        }*/

/*        *//** 약관 동의 필수 여부 *//*
        if (!joinForm.isAgree()){
            errors.rejectValue("agree", "Required");
        }*/
    }
}
