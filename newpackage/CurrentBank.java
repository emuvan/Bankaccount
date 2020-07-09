/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author vanquangnguyen
 */
public class CurrentBank implements BankAccount {
    
    private final int accountNumber ;
    private final String accountHolder ;
    private int balance;
    private Statement accountStatement;

public CurrentBank(String Holder, int number){
    balance = 1000;
    
    accountHolder = Holder;
    accountNumber = number;
    accountStatement = new Statement(Holder, number);
}

 
 
public synchronized int getBalance( )
{
    return balance;
}

public synchronized int getAccountNumber( )
{     
	return accountNumber;
}


public synchronized String getAccountHolder( )
{
    return accountHolder;
}
 
 public synchronized void deposit(Transaction t)
 {    
     balance = balance + t.getAmount();
     notifyAll();
 }
  
 public synchronized void withdrawal(Transaction t){
     
     while(balance < t.getAmount())
     {
         
         try{
             wait();
         }catch(InterruptedException e){}
     }
     
     balance = balance - t.getAmount();
     notifyAll();
 }
 
 public synchronized boolean isOverdrawn(){
     if (balance < 0) 
     {
         return true;
     }
     else
     {
         return false;
     }
 } 
         
  public synchronized void printStatement() { 
      System.out.println();
      System.out.println("Statement for " + accountHolder + "'s Account: " + accountNumber);
      System.out.println( "================================================" );
      System.out.format("%1$-20s %2$10s  %3$13s", "Customer", "Amount", "Balance" );
      System.out.println();
      System.out.println( "================================================" );     
  }              
 
}
