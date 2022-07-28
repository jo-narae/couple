package com.maker.couple.service;

import com.maker.couple.domain.Idel;
import com.maker.couple.domain.Member;
import com.maker.couple.repository.IdelRepository;
import com.maker.couple.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    IdelRepository idelRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member findById(int id) {
        return memberRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Member save(Member member, Idel idel) {
        Member result = memberRepository.save(member);

        idel.setMember(result);
        idelRepository.save(idel);

        return result;
    }

    public void delete(int id) {
        memberRepository.deleteById(id);
    }
}
