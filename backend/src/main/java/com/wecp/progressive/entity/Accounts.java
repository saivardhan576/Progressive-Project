package com.wecp.progressive.entity;

public class Accounts {
    private int account_id;
    private int customer_id;
    private double balance;

    public Accounts(int account_id,int customer_id, int balance){
        this.account_id=account_id;
        this.customer_id=customer_id;
        this.balance=balance;
    }

    public int getAccountID(){
        return account_id;
    }
    public void setAccountID(int account_id){
        this.account_id=account_id;
    }
    public int getCustomerID(){
        return customer_id;
    }
    public void setcustomerID(int customer_id){
        this.customer_id=customer_id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}
