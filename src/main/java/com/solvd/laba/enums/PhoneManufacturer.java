package com.solvd.laba.enums;

public enum PhoneManufacturer {
    APPLE("\n" + "Suzy Queue\n" +
            "4455 Landing Lange, APT 4\n" +
            "Louisville, KY 40018-1234"),
    SAMSUNG("\n" + "ATTN: Dennis Menees, CEO\n" +
            "Global Co.\n" +
            "90210 Broadway Blvd.\n" +
            "Nashville, TN 37011-5678"),
    XIAOMI("\n" + "SGT Miranda McAnderson\n" +
            "6543 N 9th Street\n" +
            "APO, AA 33608-1234");
    private String address;

    PhoneManufacturer(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }
}
