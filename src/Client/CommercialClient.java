/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
/**
 *@author Ahmed Mohamed
 * @author 20180028
 * @since 15/2/2020
 * @version 1
 */

public class CommercialClient extends Client {
        private int commercialID;
        /**
         *create commercial Client with specified data
         * @param name is client name
         * @param commercialID is client commercial ID
         * @param address is client address
         * @param phone is client phone
         * @param account is client
         */
        public CommercialClient(String name, int commercialID, String address, int phone, Object account) {
            super(name, 0000000000000, address, phone, account);
            this.commercialID=commercialID;
        }
     /**
      * set client commercial ID 
      * @param commercialID is client commercial ID
      */
        public void setCommercialID(int commercialID)
        {
            this.commercialID=commercialID;
        }
        /**
         *get client commercial ID  
         * @return commercial ID
        */
        public int getCommercialID()
        {
            return commercialID;
        }

    /**
     * return client data
     * @return client data  
     */
    @Override
        public String toString()
        {
             return "name"+this.name+"\n Phone Number:"+this.address+"Client name : "+this.name+"\ncommercialID: "+this.commercialID+"\n Address is: "+this.phone+"\n"+this.account;
        }
}
