package com.example.testproject.exercise.adapter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class AdapterTest {

    @Autowired
    private List<MessageTransfer> messageTransfers;

    @Test
    void 어답터_테스트() {
        //given
        String kakaoMessage = "KAKAOTALK";
        MessageTransfer selectObj = null;
        
        //when
        for (MessageTransfer impl : messageTransfers) {
            if (impl.isOk(kakaoMessage)) {
                selectObj = impl;
                break;
            }
        }

        assert selectObj != null;
        String result = selectObj.operate();

        //then
        Assertions.assertThat(result).isEqualTo("KakaoTalk.operate");
        Assertions.assertThat(selectObj).isInstanceOf(KakaoTalk.class);
    }
}