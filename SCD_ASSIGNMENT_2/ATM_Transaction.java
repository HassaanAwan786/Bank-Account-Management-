 
package com.mycompany.scdassignment2;
public class ATM_Transaction {

    public String getTransactionId() {
        return transactionId;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getPostBalance() {
        return postBalance;
    }
    private String transactionId;
    private String date;
    private String type;
    private double amount;
    private double postBalance;

     public ATM_Transaction() {
        
    }
    public ATM_Transaction(String transactionId, String date, String type, double amount, double postBalance) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
    }
   public void modifies()
   {
      
   }
}
