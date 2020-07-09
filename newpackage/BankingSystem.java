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
public class BankingSystem {
    
    public static void main(String args[])
    {
        final int amount = 10;
        
        //creating the bank accounts for the student and we're delaring new object using the constructors from the currentBank class.
        BankAccount baSue = new CurrentBank("SUE",1);
        BankAccount baRik = new CurrentBank("RIK",2);
        
        //creating the threadGroups
        ThreadGroup SG = new ThreadGroup("StudentGroup");
        ThreadGroup CG = new ThreadGroup("CompanyGroup");
        
        //using student constructor from its class
        Student SUE = new Student(SG,baSue,"SUE");
        Student RIK = new Student(SG,baRik,"RIK");
        
        //using Loan constructor from its class
        Loan SLoan = new Loan(CG,baSue, "Loan");
        Loan RLoan = new Loan(CG,baRik, "Loan");
        
        //using University constructor from its class
        University Suni = new University(SG, baSue, "UOW");
        University Runi = new University(SG, baRik, "UOW");
        System.out.println("number of active thread: " + SG.activeCount());
        System.out.println("number of active thread: " + CG.activeCount());
        
        //start processing the threads
        SUE.start();
        RIK.start();
        SLoan.start();
        RLoan.start();
        Suni.start();
        Runi.start();
        
        //calling the thread to a waiting state until the references thread is terminated
        SUE.join();
        RIK.join();
        SLoan.join();
        RLoan.join();
        Suni.join();
        Runi.join();
        
        //using the printstatement method
        baSue.printStatement();
        baRik.printStatement();
        
}
}