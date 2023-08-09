package com.example.testproject.dependancyinversion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class AccountTest {

    @Test
    void 테스트() {
        //given
        HolderUUID testUUID = new TestUUID("test uuid");

        //when
        Account account = Account.create("josh", testUUID);

        //test
        Assertions.assertThat(account.getAuthToken()).isEqualTo("test uuid");
    }
}