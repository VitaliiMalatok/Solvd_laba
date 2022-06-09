package com.solvd.laba.parsers.models;


import java.util.List;

public class Order {
    private int id;
    private List<Client> clients;
    private List<MobileStore> mobileStores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<MobileStore> getMobileStores() {
        return mobileStores;
    }

    public void setMobileStores(List<MobileStore> mobileStores) {
        this.mobileStores = mobileStores;
    }

}
