package tests;

import members.JoinService;
import members.JoinValidator;
import members.Users;
import members.ValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 테스트")
public class JoinTest {

    private JoinService joinService;

    /**
     * 회원 가입 시
     *
     * @return
     * */
    private Users getUserSuccess(){
        Users users = new Users();
        users.setUserId("user01");
        users.setUserPw("_aA123456");
        users.setUserNm("사용자01");
        users.setRegDt(LocalDateTime.now());

        return users;
    }

    private Users getUserFail(){
        return new Users();
    }

    @BeforeEach // 초기화 작업
    void init(){
        JoinValidator joinValidator = new JoinValidator();
        joinService = new JoinService(joinValidator);
    }


    @Test
    @DisplayName("회원가입 성공 시 예외 발생 없음")
    void joinSuccessTest(){
        assertDoesNotThrow(() -> {
            joinService.join(getUserSuccess());
        });
    }

    @Test
    @DisplayName("필수항목(userId, userPw, userNm) 검증, 검증 실패 시 ValidationException 발생")
    void requiredFieldsTest(){
        assertAll(
                // userId null 또는 빈값(공백 포함)
                () -> {
                    ValidationException thrown = assertThrows(ValidationException.class, () -> {
                        Users user = getUserSuccess();
                        user.setUserId(null);
                        joinService.join(user);
                    });

                    // 정확한 예외 발생 문구
                    String message = thrown.getMessage();
                    assertTrue(message.contains("아이디를 입력"));
                },
                () -> assertThrows(ValidationException.class, () ->{
                    Users user = getUserSuccess();
                    user.setUserId("     ");
                    joinService.join(user);
                }),// userPw null 또는 빈값(공백 포함)
                () -> assertThrows(ValidationException.class, () -> {
                    Users user = getUserSuccess();
                    user.setUserPw(null);
                    joinService.join(user);
                }),
                () -> assertThrows(ValidationException.class, () ->{
                    Users user = getUserSuccess();
                    user.setUserPw("     ");
                    joinService.join(user);
                }),
                () -> assertThrows(ValidationException.class, () -> {
                    Users user = getUserSuccess();
                    user.setUserNm(null);
                    joinService.join(user);
                }),
                () -> assertThrows(ValidationException.class, () ->{
                    Users user = getUserSuccess();
                    user.setUserNm("     ");
                    joinService.join(user);
                })
        );

        /**
        //userId null 또는 빈값(공백 포함)
        assertThrows(ValidationException.class, () ->{
            Users user = getUserFail();
            joinService.join(user);
        });

        assertThrows(ValidationException.class, () ->{
            System.out.println("여기 실행?");
            Users user = getUserFail();
            user.setUserId("    ");
            joinService.join(user);
        });
         */

    }
    @Test
    @DisplayName("userId는 6자리 이상 입력 검증, 실패 시 ValidationException, 아이디는 6자리 이상 입력하세요.")
    void userIdLengthCheckTest(){

    }

    @Test
    @Disabled
    @DisplayName("단위 테스트 연습")
    void testEx(){
//        JoinService joinService = new JoinService();
//        assertEquals(0, joinService.join());

//        assertTrue(joinService.join());
//        assertFalse(joinService.join());
//        fail();
    }
}
