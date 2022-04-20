package com.solvd.laba.enums;

public enum PhoneCharacteristic {
    IPHONE(PhoneInfo.IPHONE_INFO.getInfo(), 20, PhoneManufacturer.APPLE),
    SAMSUNG(PhoneInfo.SAMSUNG_INFO.getInfo(), 30, PhoneManufacturer.SAMSUNG),
    XIAOMI(PhoneInfo.XIAOMI_INFO.getInfo(), 40, PhoneManufacturer.XIAOMI);
    private String info;
    private int countOfPhone;
    private PhoneManufacturer manufacturer;

    PhoneCharacteristic(String info, int countOfPhone, PhoneManufacturer manufacturer) {
        this.info = info;
        this.countOfPhone = countOfPhone;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return " ||| " +
                "description: " + info +
                " ||| countOfPhone: " + countOfPhone +
                " ||| address: " + manufacturer;
    }
}
