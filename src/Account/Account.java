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
public class Account
    {
        protected int balance; 
        protected String accountNumber;
        protected Object client;
        /**
         * empty constructor to initial values
         * balance 0
         * account number 1000000
         * @since 15/2/2020
         * @deprecated don't use this constructor in coding ,it will be wrong usage  
         */
        public Account()
       {
          balance=0;
          accountNumber="10000000";
       }
        
    /**
     *create account with specified data 
     * @param balance is the account balance 
     * @param accountNumber is the account number
     */
    public Account(int balance, String accountNumber)
       {
          this.balance=balance;
          this.accountNumber=accountNumber;
       }

    /**
     * set account balance
     * @param balance is the account balance
     */
    public void setBalance(int balance)
        {
             this.balance=balance;
        }

    /**
     *set account client 
     * @param client is account client
     */
    public void setClient(Object client)
    {
        this.client=client;
    }

    /**
     *get account client
     * @return account client
     */
    public Object getClient()
    {
        return client;
    }

    /**
     *set account number
     * @param accountNumber is account number
     */
    public void setAccountNumber(String accountNumber)
        {
             this.accountNumber=accountNumber;
        }

    /**
     * get account balance
     * @return balance
     */
    public int getBalance()
        {
             return this.balance;
        }

    /**
     * get account number
     * @return account Number
     */
    public String accountNumber()
        {
             return this.accountNumber;
        }

    /**
     *print account data
     * @return account data
     */
    @Override
        public String toString()
        {
             return "Account Number is: "+this.accountNumber+"\n Balance is: "+this.balance+"\n";
        }

    /**
     * withdraw balance and calculate balance 
     * @param withdrawValue is the value,which user will withdraw 
     */
    public  void withdraw(int withdrawValue)
        {
             if(withdrawValue <= this.balance)
                 this.balance-=withdrawValue;
            else 
                 System.out.println("Your balance didn't enough");
        }

    /**
      * deposit balance and calculate balance
     * @param depositValue is the value ,which user will deposit
     */
    public  void deposit(int depositValue)
        {
            this.balance+=depositValue;
        }    
}
