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
public class Transaction {
     private final String CustomerID ;  
    private final int    amount ;

    public Transaction( String CID, int amount )
    {
        this.CustomerID  = CID ;
        this.amount 	 = amount ;
    }

    public String getCustomerID( ){ 
        return CustomerID ; }

    public int    getAmount( )    { 
        return amount ; }

    public String toString( )
    {
        return  new String( "[ " +
                               "Customer: " + CustomerID + ", " + 
                               "Amount: "   + amount     +
                            "]"  ) ;
    }
}
