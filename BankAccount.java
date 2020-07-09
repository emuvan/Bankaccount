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
public abstract interface BankAccount {
    int    getBalance( ) ;              // returns the current balance

    int    getAccountNumber( ) ;        // returns the Account number

    String getAccountHolder( ) ;        // returns the Account holder


    void deposit( Transaction t ) ;     // perform a deposit transaction on the bank account

    void withdrawal( Transaction t ) ;  // perform a withdrawal transaction on the bank account


    boolean isOverdrawn( ) ;            // returns true if overdrawn; false otherwise

    void printStatement( ) ; 
}
