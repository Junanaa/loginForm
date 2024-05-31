package daelim.spring_ch10.service;

import daelim.spring_ch10.ListCommand;
import daelim.spring_ch10.Member;
import daelim.spring_ch10.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public List<Member> selectByRegdate(ListCommand listCommand) {
        return memberDao.selectByRegdate(listCommand.getFrom(), listCommand.getTo()); // nullpointException이 발생하면 보통 .앞에 있는 객체가 널값임
    }

    public Member selectById(Long id){
        return memberDao.selectById(id);
    }
}
