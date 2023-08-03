package com.example.testproject.exercise.transaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TransactionTest {

    @Autowired MemberTxService memberTxService;
    @Autowired MemberRepository memberRepository;

    @Test
    void 내부호출_트랜잭션_테스트() {
        //given
        Member member = Member.builder()
                .name("josh")
                .email("tkddns6007@gmail.com")
                .build();

        //when
        Assertions.assertThrows(RuntimeException.class, () -> {
            memberTxService.saveMember(member);
        });

        //then
        List<Member> memberList = memberRepository.findAll();
        System.out.println("member.size() = " + memberList.size());
    }
}
