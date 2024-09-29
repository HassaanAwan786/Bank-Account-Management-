
package com.mycompany.scdassignment2;
public class Customer {

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }
    private String name;
    private String address;
    private String dob;
    private String cardNumber;
    private int pin;

    public Customer()
    {
        
    }
    public Customer(String name, String address, String dob, String cardNumber, int pin) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
  
    public boolean verifyPassword(int pin) {
        return this.pin == pin;
    }
}
