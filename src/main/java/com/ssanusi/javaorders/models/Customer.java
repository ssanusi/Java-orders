package com.ssanusi.javaorders.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long custcode;

    private String email;
    private String custcity;
    private String custname;
    private String grade;
    private double openingamt;
    private double outstandingamt;
    private double paymentamt;
    private String phone;
    private double receiveamt;
    private String workingarea;
    private String custcountry;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("customers")
    @JoinColumn(name = "agentcode", nullable = false)
    private Agent agent;

    public Customer(String custcountry) {
        this.custcountry = custcountry;
    }

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();


    public Customer() {
    }

    public Customer(String email, String custcity, String custname, String grade, double openingamt, double outstandingamt, double paymentamt, String phone, double receiveamt, String workingarea, Agent agent, String custcountry) {
        this.email = email;
        this.custcity = custcity;
        this.custname = custname;
        this.grade = grade;
        this.openingamt = openingamt;
        this.outstandingamt = outstandingamt;
        this.paymentamt = paymentamt;
        this.phone = phone;
        this.receiveamt = receiveamt;
        this.workingarea = workingarea;
        this.agent = agent;
        this.custcountry = custcountry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long customerCode) {
        this.custcode = customerCode;
    }

    public String getCustcity() {
        return custcity;
    }

    public void setCustcity(String customerCity) {
        this.custcity = customerCity;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String customerName) {
        this.custname = customerName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getOpeningamt() {
        return openingamt;
    }

    public void setOpeningamt(double openingAmount) {
        this.openingamt = openingAmount;
    }

    public double getOutstandingamt() {
        return outstandingamt;
    }

    public void setOutstandingamt(double outstandingAmount) {
        this.outstandingamt = outstandingAmount;
    }

    public double getPaymentamt() {
        return paymentamt;
    }

    public void setPaymentamt(double paymentAmount) {
        this.paymentamt = paymentAmount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getReceiveamt() {
        return receiveamt;
    }

    public void setReceiveamt(double receiveAmount) {
        this.receiveamt = receiveAmount;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingArea) {
        this.workingarea = workingArea;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
