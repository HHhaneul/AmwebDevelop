package exam02.models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class MemberListService {

    //@Autowired
    //private MemberDao memberDao;
    @Autowired
    @Qualifier("memberDao2")
    private Optional<MemberDao> opt;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");

    public MemberListService() {}


    public MemberListService(MemberDao memberDao) {
        // this.memberDao = memberDao;
    }

    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void print() {
        MemberDao memberDao = opt.get();
        List<Member> members = memberDao.gets();
        members.stream().map(this::convert).forEach(System.out::println);
    }

    private Member convert(Member member) {
        if (formatter == null) {
            return member;
        }

        String strDate = formatter.format(member.getRegDt());
        member.setRegDtStr(strDate);
        return member;
    }
}