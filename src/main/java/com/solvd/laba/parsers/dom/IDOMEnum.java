package com.solvd.laba.parsers.dom;

public interface IDOMEnum {
    String PHONE = "mobile_phone";
    String PHONE_NAME = "name";
    String PHONE_YEAR = "year";
    String PHONE_IMEI = "imei";
    String PHONE_PRICE = "price";
    public interface IStore {
        String STORE = "mobile_store";
        String STORE_NAME = "name";
        String STORE_ADDRESS = "address";

    }
    public interface ISpecification{
        String BATTERY = "battery";
        String BATTERY_MANUFACTURER = "manufacturer";
        String BATTERY_CAPACITY = "capacity";
        String BATTERY_PRICE = "price";
        String MEMORY = "memory";
        String MEMORY_MANUFACTURER = "manufacturer";
        String MEMORY_CAPACITY = "capacity";
        String MEMORY_PRICE = "price";
        String DISPLAY = "display";
        String DISPLAY_MANUFACTURER = "manufacturer";
        String DISPLAY_TYPE = "type";
        String DISPLAY_INCH = "inch";
        String DISPLAY_PRICE = "price";
        String PROCESSOR = "processor";
        String PROCESSOR_MANUFACTURER = "name";
        String PROCESSOR_FREQUENCY = "frequency";
        String PROCESSOR_NOC = "number_of_cores";
    }
}
