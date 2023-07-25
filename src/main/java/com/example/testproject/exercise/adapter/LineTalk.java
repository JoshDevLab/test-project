package com.example.testproject.exercise.adapter;

import org.springframework.stereotype.Component;

@Component
public class LineTalk implements MessageTransfer {

    private final static String KIND_OF = "LINETALK";

    @Override
    public boolean isOk(String messageKind) {
        return messageKind.equalsIgnoreCase(KIND_OF);
    }

    @Override
    public String operate() {
        return "LineTalk.operate";
    }
}
