package com.solvd.laba.parsers.models;

public class Client {
    private int id;
    private String creditCardNumber;
    private int userId;
    private String validTHRU;

    public Client() {
    }

    public Client(String creditCardNumber, int userId, String validTHRU) {
        this.creditCardNumber = creditCardNumber;
        this.userId = userId;
        this.validTHRU = validTHRU;
    }

    public Client(int id, String creditCardNumber, int userId, String validTHRU) {
        this.id = id;
        this.creditCardNumber = creditCardNumber;
        this.userId = userId;
        this.validTHRU = validTHRU;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getValidTHRU() {
        return validTHRU;
    }

    public void setValidTHRU(String validTHRU) {
        this.validTHRU = validTHRU;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", userId=" + userId +
                ", validTHRU='" + validTHRU + '\'' +
                '}';
    }
}

