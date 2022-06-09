package com.solvd.laba.parsers.models;


import java.util.List;

public class License {
    private int id;
    private List<ServiceCenter> serviceCenters;
    private List<MobileStore> mobileStores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ServiceCenter> getServiceCenters() {
        return serviceCenters;
    }

    public void setServiceCenters(List<ServiceCenter> serviceCenters) {
        this.serviceCenters = serviceCenters;
    }

    public List<MobileStore> getMobileStores() {
        return mobileStores;
    }

    public void setMobileStores(List<MobileStore> mobileStores) {
        this.mobileStores = mobileStores;
    }
}
