package com.example.testproject.dependancyinversion;

public class TestUUID implements HolderUUID {

    private final String uuidString;

    public TestUUID(String uuidString) {
        this.uuidString = uuidString;
    }

    @Override
    public String getUUID() {
        return uuidString;
    }
}
