/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Account.Account;

/**
*@author Ahmed mohamed 
* @author 20180028
*@version	1
*@since	15/2/2020
*/
public class Client {
    protected String name;
        protected int nationalID;
        protected String address;
        protected int phone; 
        protected Object account;
/**
 * create an client with specified name,national ID,address,phone and account 
*@since	15/2/2020
*@param	name is client name
*@param nationalID is client national ID
*@param address is client address
*@param account is client account 
*/
        public Client(String name,int nationalID,String address,int phone,Object account)
        {
            this.name=name;
            this.nationalID=nationalID;
            this.address=address;
            this.phone=phone;
            this.account=account;
        }
        /**
         * to set client name  
        *@since	15/2/2020
        *@param	name is client name 
        */
        public void setName(String name)
        {
            this.name=name;
        }
        /**
         * to set client nationalID  
        *@since	15/2/2020
        *@param	nationalID is client national ID 
        */
        public void setNationalID(int nationalID)
        {
            this.nationalID=nationalID;
        }
        /**
         * to set client address  
        *@since	15/2/2020
        *@param	address is client address 
        */
        public void setAddress(String address)
        {
            this.address=address;
        }
        /**
         * to set client phone  
        *@since	15/2/2020
        *@param	phone is client phone 
        */
        public void setPhone(int phone)
        {   
            this.phone=phone;
        }
        /**
         * to set client account  
        *@since	15/2/2020
        *@param	account is client account 
        */
        public void setAccount(Object account)
        {
            this.account=account;
        }
        /**
         * to get name of client
         * @since 15/2/2020
         * @return client name
         */
        public String getName()
        {
            return this.name;
        }
        /**
         * to get national ID of client
         * @since 15/2/2020
         * @return client national ID
         */
        public int getNationalID()
        {
            return this.nationalID;
        }
        /**
         * to get address of client
         * @since 15/2/2020
         * @return client address
         */
        public String getAddress()
        {
            return this.address;
        }
        /**
         * to get phone of client
         * @since 15/2/2020
         * @return client phone
         */
        public int getPhone()
        {   
            return this.phone;
        }
        /**
         * to get account of client
         * @since 15/2/2020
         * @return client account
         */
        public Object getAccount()
        {
            return this.account;
        }  
    @Override
        /**
         * to print client information
         * @since 15/2/2020
         * @return client data
         */
        public String toString()
        {
             return "Client name : "+this.name+"\nNational ID: "+this.nationalID+"\nAddress is: "+this.address+"\n"+this.account;
        }
}
