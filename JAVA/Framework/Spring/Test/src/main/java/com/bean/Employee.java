package com.bean;

import java.util.List;

public class Employee {
    private int Empid,salary,aid;
    private String firstName,lastName;

    private List<Address> address;   public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public int getAid() {
        return aid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Empid=" + Empid +
                ", salary=" + salary +
                ", aid=" + aid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

}

