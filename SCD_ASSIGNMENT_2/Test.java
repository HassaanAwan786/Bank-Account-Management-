 

package com.mycompany.scdassignment2;
 import java.util.*;
 public class Test {
    public static void main(String[] args) {
   
        // Add Account to Bank
       

        
     

        
         
          
          
         Scanner input=new Scanner(System.in);
          System.out.println(" *****************************************"+"Enter the following information once inorder to run functions of classes"
                  + "*****************************************************");
                        System.out.println("Plz Enter Bank Code And Address");
                        String code=input.nextLine();
                        String address=input.nextLine();

                      Bank bank = new Bank(code,address);
                      System.out.println("Plz Enter location of ATM");
                      String location=input.nextLine();
                      ATM atm = new ATM(location, bank);

          
          
                        System.out.println("Plz Enter Name of customer");
                          String name=input.nextLine();
                          System.out.println("Plz Enter Address of customer");
                          String addr_of_C=input.nextLine();
                          System.out.println("Plz Enter DoB of customer");
                          String dob=input.nextLine();
                          System.out.println("Plz Enter CardNumber for customer");
                         String cardNumber=input.nextLine();
                         System.out.println("Plz Enter Pin for customer");
                           int pin=input.nextInt();
            
                           
                           System.out.println("Plz Enter SvingAccount number and Balance ");
                            String number=input.nextLine();
                            double balance=input.nextDouble();
                             SavingAccount savingAccount = new SavingAccount(number,balance);
 
           while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1) IF you are want to Run addIdentifiedCustomer function");
            System.out.println("2) IF you are want to Run verifyPassword function");
            System.out.println("3) IF you are want to Run addMaintainedAccount function");
            System.out.println("4) IF you are want to Run deposit function");
            System.out.println("5) IF you are want to Run withdraw function");
            System.out.println("6) IF you are want to Run Print balance ");
            System.out.println("7) Exit");
            
              int choice = input.nextInt();
            input.nextLine();
            if (choice == 1)
                    {
                        try{
                                            //  Customer  object

                                           Customer customer=new Customer(name,addr_of_C,dob,cardNumber,pin);
                                             // Add Customer to ATM
                                             atm.addIdentifiedCustomer(customer);
                                             System.out.println("**************Successfull run****************");
                            } catch ( Exception e) {
                                System.out.println("something went wrong");}
                    } 
            else if (choice == 2) 
                    {    
                        try{
                                            System.out.println("Plz Enter Pin that you want to verify");
                                               int V_pin=input.nextInt();
                                               Customer customer=new Customer(name,addr_of_C,dob,cardNumber,pin);
                                              customer.verifyPassword(V_pin);
                                              System.out.println("**************Successfull run****************");
                            } catch ( Exception e) {
                            System.out.println("something went wrong");}
                    }
            else if (choice ==3) 
                    {
                       
                    try{
                                     bank.addMaintainedAccount(savingAccount);
                                     System.out.println("**************Successfull run****************");
                        } catch ( Exception e) {
                          System.out.println("something went wrong");}
                    }
            else if (choice ==4) 
                    {
                        try{
                                        // Deposit money in Account
                                         //child class is calling function of parent class 
                                          System.out.println("Plz Enter amount to deopist");
                                          double D_money=input.nextDouble();
                                         savingAccount.deposit(D_money);
                                         System.out.println("**************Successfull run****************");
                            } catch ( Exception e) {
                            System.out.println("something went wrong");}

                    }
            else if (choice ==5) 
                    {
                                                // Withdraw money from Account
                           try {
                                 System.out.println("Plz Enter amount to withdraw");
                            double W_money=input.nextDouble();
                               savingAccount.withdraw(W_money);
                               System.out.println("**************Successfull run****************");
                           } catch ( Exception e) {
                               System.out.println("your balance is Insufficient ");}
                   
                    }
            else if (choice ==6) 
                    {
                                                // Withdraw money from Account
                           try {
                                 // Print Account Balance
                                System.out.println("your Account Balance is: " + savingAccount.getBalance(balance));
                                  System.out.println("**************Successfull run****************");
                                 } catch ( Exception e) {
                                System.out.println("something went wrong"); }
                    }
            else 
                    {
                            System.out.println("Invalid choice");
                    }
           } 
    } 
 }

