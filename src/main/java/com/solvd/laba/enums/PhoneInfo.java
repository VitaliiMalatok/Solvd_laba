package com.solvd.laba.enums;

public enum PhoneInfo {
    IPHONE_INFO {
        @Override
        public String getInfo() {
            return "Iphone most popular phone in the world";
        }
    },
    SAMSUNG_INFO {
        @Override
        public String getInfo() {
            return "Samsung made in South Korea";
        }
    },
    XIAOMI_INFO {
        @Override
        public String getInfo() {
            return "Xiaomi it is popular China brand";
        }
    };

    public abstract String getInfo();
}
