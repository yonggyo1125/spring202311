package models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class ListService {

    private MemberDao memberDao;

    private Optional<DateTimeFormatter> opt;

    @Autowired
    public void setFormatter(Optional<DateTimeFormatter> opt) {

        this.opt = opt;
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao) {

        this.memberDao = memberDao;
    }

    public void print() {
        List<Member> members = memberDao.getList();
        for (Member member : members) {
            DateTimeFormatter formatter = opt.orElse(null);
            if (formatter != null) {
                String regDtStr = formatter.format(member.getRegDt());
                member.setRegDtStr(regDtStr);
            }

            System.out.println(member);
        }
    }
}
