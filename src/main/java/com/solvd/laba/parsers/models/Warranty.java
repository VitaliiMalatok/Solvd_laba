package com.solvd.laba.parsers.models;


import java.util.List;

public class Warranty {
    private int id;
    private List<Client> clientsId;
    private String nameBreakdown;
    private int mobilePhoneId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Client> getClientsId() {
        return clientsId;
    }

    public void setClientsId(List<Client> clientsId) {
        this.clientsId = clientsId;
    }

    public String getNameBreakdown() {
        return nameBreakdown;
    }

    public void setNameBreakdown(String nameBreakdown) {
        this.nameBreakdown = nameBreakdown;
    }

    public int getMobilePhoneId() {
        return mobilePhoneId;
    }

    public void setMobilePhoneId(int mobilePhoneId) {
        this.mobilePhoneId = mobilePhoneId;
    }


}
