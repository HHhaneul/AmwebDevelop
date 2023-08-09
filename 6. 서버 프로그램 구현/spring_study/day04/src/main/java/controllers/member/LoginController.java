package controllers.member;

import lombok.RequiredArgsConstructor;
import models.member.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/login")
@RequiredArgsConstructor
public class LoginController {

    //@Autowired
    private final LoginService loginService;

    @GetMapping
    public String login(/*HttpServletRequest request, HttpServletResponse response, HttpSession session*/){

        loginService.login();

        /*
        String userId = request.getParameter("userId");
        String userNm = request.getParameter("userNm");

        System.out.printf("userId: %s, userNm: %s%n", userId, userNm);
        System.out.println(response);
        System.out.println(session);
        */

        return "member/login";
    }

    @PostMapping
    public String loginPs(){

        return "redirect:/myPage";
    }
}
