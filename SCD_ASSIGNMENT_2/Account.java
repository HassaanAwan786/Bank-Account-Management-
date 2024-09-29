 
package com.mycompany.scdassignment2;
import java.util.ArrayList;

public class Account {
    private String number;
    private double balance;
    private ArrayList<ATM_Transaction> transactionHistory;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<ATM_Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
        this.transactionHistory = new ArrayList<ATM_Transaction>();
    }

    public void deposit(double amount) {
        this.balance += amount;
        ATM_Transaction transaction = createTransaction(amount, "DEPOSIT");
        this.transactionHistory.add(transaction);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        ATM_Transaction transaction = createTransaction(amount, "WITHDRAWAL");
        this.transactionHistory.add(transaction);
    }
    protected ATM_Transaction createTransaction(double amount, String type) {
        ATM_Transaction transaction=new ATM_Transaction();
        return transaction ;
    }
}  
