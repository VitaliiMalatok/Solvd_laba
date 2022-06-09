package com.solvd.laba.parsers.models;

public class Worker {
    private int id;
    private String position;
    private String experience;
    private int userId;
    private int mobileStoreId;

    public Worker(){
    }

    public Worker(String position, String experience, int userId, int mobileStoreId) {
        this.position = position;
        this.experience = experience;
        this.userId = userId;
        this.mobileStoreId = mobileStoreId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMobileStoreId() {
        return mobileStoreId;
    }

    public void setMobileStoreId(int mobileStoreId) {
        this.mobileStoreId = mobileStoreId;
    }
}
