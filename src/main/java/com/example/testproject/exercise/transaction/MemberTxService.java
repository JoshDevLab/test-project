package com.example.testproject.exercise.transaction;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberTxService {

    private final MemberRepository memberRepository;
    private final OrderTxService orderTxService;

    @Transactional
    public void saveMember(Member member) {

        memberRepository.save(member);
        orderTxService.saveOrder(member);
    }
}
