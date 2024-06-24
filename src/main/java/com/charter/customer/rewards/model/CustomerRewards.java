package com.charter.customer.rewards.model;

public class CustomerRewards {

    private int customerId;
    private String customerName;
    private int firstMonthRewardPoints;
    private int secondMonthRewardPoints;
    private int thirdMonthRewardPoints;
    private int totalRewards;

    public CustomerRewards(int customerId, String customerName, int firstMonthRewardPoints, int secondMonthRewardPoints, int thirdMonthRewardPoints, int totalRewards) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.firstMonthRewardPoints = firstMonthRewardPoints;
        this.secondMonthRewardPoints = secondMonthRewardPoints;
        this.thirdMonthRewardPoints = thirdMonthRewardPoints;
        this.totalRewards = totalRewards;
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

    public int getFirstMonthRewardPoints() {
        return firstMonthRewardPoints;
    }

    public void setFirstMonthRewardPoints(int firstMonthRewardPoints) {
        this.firstMonthRewardPoints = firstMonthRewardPoints;
    }

    public int getSecondMonthRewardPoints() {
        return secondMonthRewardPoints;
    }

    public void setSecondMonthRewardPoints(int secondMonthRewardPoints) {
        this.secondMonthRewardPoints = secondMonthRewardPoints;
    }

    public int getThirdMonthRewardPoints() {
        return thirdMonthRewardPoints;
    }

    public void setThirdMonthRewardPoints(int thirdMonthRewardPoints) {
        this.thirdMonthRewardPoints = thirdMonthRewardPoints;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(int totalRewards) {
        this.totalRewards = totalRewards;
    }

    @Override
    public String toString() {
        return "CustomerRewards{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", firstMonthRewardPoints=" + firstMonthRewardPoints +
                ", secondMonthRewardPoints=" + secondMonthRewardPoints +
                ", thirdMonthRewardPoints=" + thirdMonthRewardPoints +
                ", totalRewards=" + totalRewards +
                '}';
    }
}
