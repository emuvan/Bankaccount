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
public class Student extends Thread {
    
    private final BankAccount Bankaccount;
    
public Student(ThreadGroup TG, BankAccount bankaccount, String CID){
 super(TG, CID);
 this.Bankaccount = bankaccount;
}

public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            Transaction t = new Transaction(getName(),1000);
            Bankaccount.deposit(t);
            System.out.println(getName() + " deposit: " + i);
            try{ sleep(3000); }
            catch (InterruptedException e){}
        }
        
        for(int i = 0; i < 3; i++){
            Transaction t2 = new Transaction(getName(),1000);
            Bankaccount.withdrawal(t2);
            System.out.println(getName() + " withdraw: " + i);
            try{ sleep(3000); }
            catch (InterruptedException e){}
        }
    }





}