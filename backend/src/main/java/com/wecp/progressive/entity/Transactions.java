package com.wecp.progressive.entity;
import java.util.Date;


public class Transactions {
    private int transaction_id;
    private int account_id;
    private double amount;
    private Date transaction_date;
    private String transaction_type;

    
    public Transactions() {
    }

    public Transactions(int transaction_id,int account_id,double amount,Date transaction_date, String transaction_type){
        this.account_id=account_id;
        this.transaction_id=transaction_id;
        this.amount=amount;
        this.transaction_date=transaction_date;
        this.transaction_type=transaction_type;
    }

    public int getTransactionID(){
        return transaction_id;
    }
    public void setTransactionDate(int transaction_id){
        this.transaction_id=transaction_id;
    }
    public int getAccountID(){
        return account_id;
    }
    public void setAccountID(int account_id){
        this.account_id=account_id;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public Date getTransactionDate(){
        return transaction_date;
    }
    public void setTransactionDate(Date transaction_date){
        this.transaction_date=transaction_date;
    }
    public String getTransactionType(){
        return transaction_type;
    }
    public void setTransactionType(String transaction_type){
        this.transaction_type=transaction_type;
    }

>>>>>>> 50a6f569cd1bac767eaf20ace586d6e76cc56b0b


}