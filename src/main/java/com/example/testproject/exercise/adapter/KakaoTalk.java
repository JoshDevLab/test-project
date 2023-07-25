package com.example.testproject.exercise.adapter;

import org.springframework.stereotype.Component;

@Component
public class KakaoTalk implements MessageTransfer {

    private final static String KIND_OF = "KAKAOTALK";

    @Override
    public boolean isOk(String messageKind) {
        return messageKind.equalsIgnoreCase(KIND_OF);
    }

    @Override
    public String operate() {
        return "KakaoTalk.operate";
    }
}
