package com.scanpay.expense;

public class Expense {
    private String amount;
    private String spentOn;
    private String date;

    // Default constructor
    public Expense() {}

    // Constructor with fields
    public Expense(String amount, String spentOn, String date) {
        this.amount = amount;
        this.spentOn = spentOn;
        this.date = date;
    }

    // Getters and Setters
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSpentOn() {
        return spentOn;
    }

    public void setSpentOn(String spentOn) {
        this.spentOn = spentOn;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
