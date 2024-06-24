package com.charter.customer.rewards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.sql.Timestamp;


@Entity
@Table(name = "TRANSACTION")
public class CustomerTransaction {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private int transactionId;

    @Column(name="CUSTOMER_ID")
    private int customerId;

    @Column(name="CUSTOMER_NAME")
    private String customerName;

    @Column(name="TRANSACTION_AMOUNT")
    private double transactionAmount;

    @Column(name="TRANSACTION_DATE")
    private Timestamp transactionDate;

    public CustomerTransaction(int transactionId, int customerId, String customerName, double transactionAmount, Timestamp transactionDate) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }

    public CustomerTransaction() {

    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
}
