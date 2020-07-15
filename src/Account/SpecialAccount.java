/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
*@author Moamen Eid  
* @author 20180299
*@version	1
*@since	15/2/2020
*/
public class SpecialAccount extends Account {

    /**
     *create special account with specified data
     * @param balance is account balance
     * @param accountNumber is account number
     */
    public SpecialAccount(int balance,String accountNumber)
        {
            super(balance,accountNumber);
        }
        /**
        * withdraw balance and calculate balance and give client the right to withdraw 1000 pounds without have real balance 
        * @param withdrawValue is the value,which user will withdraw 
        */
        @Override
        public void withdraw(int withdrawValue)
        {
            if(withdrawValue <= (this.balance+1000))
                this.balance-=withdrawValue;
            else 
                 System.out.println("Your balance didn't enough");
        }    
    
}
