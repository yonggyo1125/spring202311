package mapper;

import models.member.Member;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {

    @Select("SELECT * FROM MEMBER")
    List<Member> getMembers();
}
