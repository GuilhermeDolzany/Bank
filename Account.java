package com.guilhermedolzany.bank;

public class Account {

    private String ag;
    private String cc;
    private String name;
    private double balance;

    private static final int MAX_LENGTH = 12;

    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        this.balance = 0.0; // Toda conta nova começa zerada
    }

    private void setName(String name) {
        if (name != null && name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
    }

    public boolean deposit(double value) {
        if (value > 0) {
            this.balance += value;
            return true;
        }
        return false;
    }

    public boolean withDraw(double value) {
        if (value > 0 && this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public double getBalance() { return balance; }
    public String getName() { return name; }
    public String getAg() { return ag; }
    public String getCc() { return cc; }
}