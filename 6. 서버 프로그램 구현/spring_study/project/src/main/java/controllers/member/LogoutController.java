package controllers.member;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

    @RequestMapping("/member/logout")
    public String logout(HttpSession session){

        /** 세션 비우기 */
        session.invalidate();

        return "redirect:/member/login";
    }
}
