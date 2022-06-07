package com.solvd.laba.dao.model;

import java.util.Objects;

public class LocalDelivery {
    private int id;
    private String employmentDate;
    private String firstName;
    private String lastName;
    private int workShift;

    public LocalDelivery() {
    }

    public LocalDelivery(String employmentDate, String firstName, String lastName, int workShift) {
        this.employmentDate = employmentDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.workShift = workShift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkShift() {
        return workShift;
    }

    public void setWorkShift(int workShift) {
        this.workShift = workShift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalDelivery that = (LocalDelivery) o;
        return id == that.id && workShift == that.workShift && Objects.equals(employmentDate, that.employmentDate) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employmentDate, firstName, lastName, workShift);
    }

    @Override
    public String toString() {
        return "LocalDelivery{" +
                "id=" + id +
                ", employmentDate='" + employmentDate + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workShift=" + workShift +
                '}';
    }
}
