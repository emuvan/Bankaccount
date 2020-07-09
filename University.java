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
public class University extends Thread {
    
    private final BankAccount bankaccount;
     
    public University(ThreadGroup TG, BankAccount bankaccount, String CID){
     super(TG, "University fees #" + CID);   
     this.bankaccount = bankaccount;   
    }
    
    public void run(){
        
        for(int i = 0; i < 3; i++){
        Transaction t3 = new Transaction(getName(),1000);
        bankaccount.withdrawal(t3);
        System.out.println(getName() + " withdraw: " + i);
            try{ sleep(3000); }
            catch (InterruptedException e){}
        }
     }
}

