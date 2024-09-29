 
package com.mycompany.scdassignment2;
import java.util.ArrayList;

public class Bank {

    public String getCode() {
        return code;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Account> getManages() {
        return manages;
    }

    public ArrayList<ATM> getMaintains() {
        return maintains;
    }
    private String code;
    private String address;
    private ArrayList<Account> manages;
    private ArrayList<ATM> maintains;

    public Bank(String code, String address) {
        this.code = code;
        this.address = address;
        this.manages = new ArrayList<Account>();
        this.maintains = new ArrayList<ATM>();
    }

    public void addMaintainedAccount(SavingAccount Saccount) {
        this.manages.add(Saccount);
    }
 
    public void addATM(ATM atm) {
        this.maintains.add(atm);
    }
}
