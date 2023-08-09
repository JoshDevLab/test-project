package com.example.testproject.dependancyinversion;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class Account {

    private final String username;
    private final String authToken;

    public static Account create(String username, HolderUUID systemUUID) {
        return Account.builder()
                .username(username)
                .authToken(systemUUID.getUUID())
                .build();
    }
}
