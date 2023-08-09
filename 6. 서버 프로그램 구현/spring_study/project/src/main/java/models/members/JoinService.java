package models.members;

import controllers.models.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final JoinValidator joinValidator;
    private final MemberDao memberDao;

    public void join(JoinForm joinForm, Errors errors){
        joinValidator.validate(joinForm, errors);

        if (errors.hasErrors())return;

        memberDao.register(joinForm);
    }
}
