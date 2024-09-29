
package com.mycompany.scdassignment2;
 import java.util.ArrayList;

public class ATM {

    public String getLocation() {
        return location;
    }

    public Bank getManagedBy() {
        return managedBy;
    }

    public ArrayList<Customer> getIdentifies() {
        return identifies;
    }

    public ArrayList<ATM_Transaction> getTransactions() {
        return transactions;
    }
    private String location;
    private Bank managedBy;
    private ArrayList<Customer> identifies;
    private ArrayList<ATM_Transaction> transactions;

    public ATM(String location, Bank managedBy) {
        this.location = location;
        this.managedBy = managedBy;
        this.identifies = new ArrayList<Customer>();
        this.transactions = new ArrayList<ATM_Transaction>();
    }

    public void addCustomer(Customer customer) {
        this.identifies.add(customer);
    }
 public void addIdentifiedCustomer(Customer customer)
   {
       //customer.;
   }
    public void addTransaction(ATM_Transaction transaction) {
        this.transactions.add(transaction);
    }
}