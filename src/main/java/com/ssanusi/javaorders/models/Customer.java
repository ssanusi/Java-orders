package com.ssanusi.javaorders.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID customerCode;

    @Column(unique = true, nullable = false)
    private String email;
    private String customerCity;
    private String customerName;
    private String grade;
    private double openingAmount;
    private double outstandingAmount;
    private double paymentAmount;
    private String phone;
    private double receiveAmount;
    private String workingArea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agentCode", nullable = false)
    private Agent agent;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();


    public Customer() {
    }

    public Customer(String email, String customerCity, String customerName, String grade, double openingAmount, double outstandingAmount, double paymentAmount, String phone, double receiveAmount, String workingArea, Agent agent) {
        this.email = email;
        this.customerCity = customerCity;
        this.customerName = customerName;
        this.grade = grade;
        this.openingAmount = openingAmount;
        this.outstandingAmount = outstandingAmount;
        this.paymentAmount = paymentAmount;
        this.phone = phone;
        this.receiveAmount = receiveAmount;
        this.workingArea = workingArea;
        this.agent = agent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(UUID customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getOpeningAmount() {
        return openingAmount;
    }

    public void setOpeningAmount(double openingAmount) {
        this.openingAmount = openingAmount;
    }

    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(double outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(double receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
