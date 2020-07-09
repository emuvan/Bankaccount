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
public class Loan extends Thread {
    
    private BankAccount bankaccount;
    
    public Loan(ThreadGroup TG, BankAccount bankaccount, String CID){
    super(TG, "Loan #" + CID);
    this.bankaccount = bankaccount;
    }
    
    public void run(){
        
        for(int i = 0; i < 3; i++){
        Transaction t4 = new Transaction(getName(),1000);
        bankaccount.deposit(t4);
        System.out.println(getName() + " deposit: " + i);
        try{ sleep(3000); }
        catch (InterruptedException e){}    
        }
    }
}
