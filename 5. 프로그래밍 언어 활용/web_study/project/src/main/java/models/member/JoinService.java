package models.member;

import jakarta.servlet.http.HttpServletRequest;
import validators.Validator;

public class JoinService {

    private Validator<Member> validator;
    private MemberDao memberDao;

    public JoinService(Validator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void join(Member member) {
        // Member, Validator, MemberDao 의존성! 3개의 객체가 책임을 가지며 역할을 맡고 협력한다!

        // 유효성 검사
        validator.check(member);

        // 회원 가입
        memberDao.register(member);

    }

    public void join(HttpServletRequest request) {
        Member member = Member.builder()
                .userId(request.getParameter("userId"))
                .userPw(request.getParameter("userPw"))
                .userPwRe(request.getParameter("userPwRe"))
                .userNm(request.getParameter("userNm"))
                .agree(Boolean.parseBoolean(request.getParameter("agree")))
                .build();
        join(member);
    }
}