package com.example.testproject.codingTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    static String changeAlarm(int hh, int mm) {

        final int MINUTE = 45;
        int hour;

        if (mm-MINUTE >= 0) {
            return String.valueOf(hh) + " " + String.valueOf(mm-MINUTE);
        }

        hour = hh-1;

        if (hour < 0) {
            hour = 23;
        }

        return String.valueOf(hour) + " " + String.valueOf(60-Math.abs(mm-MINUTE));
    }

    @Test
    void 테스트() {
        //given
        int hh = 0;
        int mm = 55;

        //when
        String result = changeAlarm(hh, mm);

        //then
        Assertions.assertThat(result).isEqualTo("0 10");
    }
}