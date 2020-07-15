
import Account.Account;
import Account.SpecialAccount;
import Client.Client;
import Client.CommercialClient;
import java.util.ArrayList;
import java.util.List;

/**
*@author Ahmed mohamed 
* @author 20180028
*@version	1
*@since	15/2/2020
*/
public class Bank {

    protected String name;
        protected String address;
        protected int phone;
        protected List<Object> accounts = new ArrayList<>();
        protected List<Object> clients = new ArrayList<>();
        /**
         * create Bank with specified data
         * @param name bank name
         * @param address bank address
         * @param phone bank phone
         */

        Bank(String name,String address,int phone)
        {
            this.name=name;
            this.address=address;
            this.phone=phone;
        }
        /**
         *set bank name
         * @param name bank name
         */
        void setName(String name)
        {
            this.name=name;
        }
        /**
         * set bank address
         * @param  address bank address
         */
        void setAddress(String address)
        {
            this.address=address;
        }
        /**
         * set bank phone
         * @param phone bank phone
         */
        void setPhone(int phone)
        {
            this.phone=phone;
        }
        /**
         *get bank name
         * @return  bank name
         */
        String getName()
        {
            return this.name;
        }
        /**
         *get bank address
         * @return  address
         */
        String getAddress()
        {
            return this.address;
        }
        /**
        *get bank phone
        * @param bank phone
        */
        int getPhone()
        {
            return this.phone;
        }
        /**
         *add clients and accounts in bank System
         * @param client is new client ,who user will add
         * @param account is the new client account  
         */
        void addClients(Object client,Object account)
        {
            String checker="false";
            Account tempAccount1=new Account(0,"!");// to know type of account
            SpecialAccount tempSpecialAccount1=new SpecialAccount(0,"!");// to know type of account
            if(account.getClass()==Account.class)
                {
                    tempAccount1=(Account)account;
                }
                if(account.getClass()==SpecialAccount.class)
                {
                    tempSpecialAccount1=(SpecialAccount)account;
                }
            
            for (Object account1 : accounts) // to check if the new account is created for another client or no
            {   
                
                if(account1.getClass()==Account.class)
                {
                    Account tempAccount=(Account)account1;
                    if (tempAccount.accountNumber().equals(tempAccount1.accountNumber())||tempAccount.accountNumber().equals(tempSpecialAccount1.accountNumber()) ) {
                        checker="true";
                    }
                }
                if(account1.getClass()==SpecialAccount.class)
                {
                    SpecialAccount tempSpecialAccount=(SpecialAccount)account1;
                    if (tempSpecialAccount.accountNumber().equals(tempSpecialAccount1.accountNumber())||tempSpecialAccount.accountNumber().equals(tempAccount1.accountNumber())) {
                        checker="true";
                        
                    }
                }
            }
            
                if(checker.equals("false")) {
                  this.clients.add(client);
                  this.accounts.add(account);
                  System.out.println("successfully done");  
                } 
                else{
                  System.out.println("this account is created for another client in this Bank system");  
                }
            
        }
        /**
         * print all clients data in bank System
         */
        void displayClients()
        {
            
            for (int i=0;i<clients.size();i++) {
                int counter;
                counter = 1; // to print client number
                System.out.println("Acccount number :"+counter);
                System.out.println(clients.get(i).toString());
            }
        }
        /**
         * print all accounts data in bank System
         */
        void displayAccounts()
        {
            for (int i=0;i<accounts.size();i++) {
                int counter;
                counter = 1; //to print account number
                System.out.println("Acccount number :"+counter);
                System.out.println(accounts.get(i).toString());
            }
        }

    /**
     * withdraw amount of money from an client account 
     * @param accountNumber account number or client number it's the same ,which give account number in the arrays begin frome 0 
     * @param withdrawValue amount the user will withdraw
     */
    public void withdraw(int accountNumber,int withdrawValue)
        {
            try{
            if(accountNumber<=accounts.size())
            {
                accountNumber--;
                Account account ;
                SpecialAccount specialAccount;
                Client client;
                CommercialClient commercialClient;
                
                if(accounts.get(accountNumber).getClass()==Account.class)
                {
                    account=(Account) accounts.get(accountNumber);
                    account.withdraw(withdrawValue);
                    
                    accounts.set(accountNumber, account);
                }
                else if(accounts.get(accountNumber).getClass()==SpecialAccount.class)
                {
                    specialAccount=(SpecialAccount) accounts.get(accountNumber);
                    specialAccount.withdraw(withdrawValue);
                    
                    accounts.set(accountNumber, specialAccount);
                }
                if(clients.get(accountNumber).getClass()==Client.class)
                {
                    client=(Client)clients.get(accountNumber);
                    client.setAccount(accounts.get(accountNumber));
                    clients.set(accountNumber, client);
                }
                else
                {
                    commercialClient=(CommercialClient)clients.get(accountNumber);
                    commercialClient.setAccount(accounts.get(accountNumber));
                    clients.set(accountNumber, commercialClient);
                    
                }
            }
            else
                System.out.println("invalid number");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }  
        /**
        * deposit amount of money from an client account 
        * @param accountNumber account number or client number it's the same ,which give account number in the arrays begin frome 0 
        * @param depositValue amount the user will withdraw
        */
       void deposit(int accountNumber,int depositValue)
        {
            accountNumber--;
            try{
                if(accountNumber<=accounts.size())
            {
                Account account ;
                SpecialAccount specialAccount;
                Client client;
                CommercialClient commercialClient;
                
                if(accounts.get(accountNumber).getClass()==Account.class)
                {
                    account=(Account) accounts.get(accountNumber);
                    account.deposit(depositValue);
                    
                    accounts.set(accountNumber, account);
                }
                else if(accounts.get(accountNumber).getClass()==SpecialAccount.class)
                {
                    specialAccount=(SpecialAccount) accounts.get(accountNumber);
                    specialAccount.deposit(depositValue);
                    accounts.set(accountNumber, specialAccount);
                }
                if(clients.get(accountNumber).getClass()==Client.class)
                {
                    client=(Client)clients.get(accountNumber);
                    client.setAccount(accounts.get(accountNumber));
                    clients.set(accountNumber, client);
                }
                else
                {
                    commercialClient=(CommercialClient)clients.get(accountNumber);
                    commercialClient.setAccount(accounts.get(accountNumber));
                    clients.set(accountNumber, commercialClient);
                    
                }
            }
            else
                System.out.println("invalid number");
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Bank a=new Bank("asa","sdss",1012);
        System.out.println(a.getAddress());
        Account asd;
        asd = new Account(12456,"52222222222s");
        Client asdd=new Client("ahmed",258558,"dfdfgvd",1119,asd);
        a.addClients(asdd,asd);
        a.displayAccounts();
    }
}
