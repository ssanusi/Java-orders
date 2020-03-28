package com.ssanusi.javaorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;
    private String type;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "orderspayments", joinColumns = {@JoinColumn(name = "paymentid")}, inverseJoinColumns = {@JoinColumn(name = "ordnum")})
    private Set<Order> orders = new HashSet<>();

    public Payment() {
    }


    public Payment(long paymentid, String type) {
        this.paymentid = paymentid;
        this.type = type;
    }

    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentId) {
        this.paymentid = paymentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
