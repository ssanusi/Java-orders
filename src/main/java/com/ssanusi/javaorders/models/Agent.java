package com.ssanusi.javaorders.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "agents")
public class Agent {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID agentCode;

    @Column(unique = true, nullable = false)
    private String email;

    private String agentName;
    private double commission;
    private String country;
    private String phone;
    private String workingArea;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
    private List<Customer> customers = new ArrayList<>();


    public Agent() {
    }

    public Agent(String agentName, String email, double commission, String country, String phone, String workingArea) {
        this.agentName = agentName;
        this.commission = commission;
        this.country = country;
        this.phone = phone;
        this.workingArea = workingArea;
        this.email = email;
    }

    public UUID getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(UUID agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
