package com.example.testproject.dependancyinversion;

import java.util.UUID;

public class SystemUUID implements HolderUUID {
    @Override
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
