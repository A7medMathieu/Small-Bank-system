
import Account.Account;
import Account.SpecialAccount;
import Client.Client;
import Client.CommercialClient;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Main class use to test Bank System with main menu to allow user manage the bank System
 * @since 18/2/2020
 * @version 1
 * @author Ahmed Mohamed
 * @author 20150028
 * @author moamen Eid
 * @author 20180299
 */
public class Main {
    
    /**
     *main method to make the software run and test the methods was written in system classes alike Bank,Account,and Client 
     * @param args didn't used
     */
    public static void main(String[] args)
        {
            // TODO code application logic here
            Bank bank;
            Account account;
            SpecialAccount specialAccount;
            Client client;
            CommercialClient commercialClient;
            Scanner scanner=new Scanner(System.in);
            String name,address;
            int phone;
            System.out.println("Enter Bank name: ");
            name=scanner.nextLine();
            System.out.println("Enter Bank Address: ");
            address=scanner.nextLine();
            System.out.println("Enter Bank phone: ");
            phone=scanner.nextInt();
            bank=new Bank (name,address,phone);
            System.out.println("                  Hello in "+ bank.getName()
            +"\n                  **************************************\n");
            
            boolean option1=true;
            while(option1)
            {
             System.out.println("[1]Add client and account\n"
            +"[2]clients list\n"
            +"[3]accounts list\n"
            +"[4]deposit\n"
            +"[5]withdraw\n"
            +"[6]Exit\n");
            System.out.println("your option : ");
            String option;
                option=scanner.next();
                switch(option)
                {
                    case "1":
                        boolean checker=true;
                        while(checker)
                        {
                            System.out.println("which type of Clients you want to add"
                            +"\n[1]client\n[2]commercial client\n");
                            String clientName,clientAddress;
                            int clientPhone,nationalID; 
                            option=scanner.next();
                            if("1".equals(option)||"2".equals(option))
                            {       
                                System.out.println("client name");
                                scanner.nextLine();
                                clientName=scanner.nextLine();
                                System.out.println("client address");
                                address=scanner.nextLine();
                                System.out.println("client phone");
                                clientPhone=scanner.nextInt();
                                switch (option)
                                {
                                 case "1":
                                    System.out.println("client national ID");
                                    nationalID=scanner.nextInt();
                                    System.out.println("which type of Accounts you want to add"
                                    +"\n[1]Account\n[2]Special Account\n");
                                    option=scanner.next();
                                    if("2".equals(option)||"1".equals(option))                                
                                    {
                                        String accountNumber;
                                        int balance;
                                        System.out.println("account number");
                                        accountNumber=scanner.next();
                                        System.out.println("account balance");
                                        balance=scanner.nextInt();
                                        switch(option)
                                        {   
                                        case "1":
                                            account=new Account(balance,accountNumber);
                                            client=new Client(name,nationalID,address,phone,account);
                                            account.setClient(client);
                                            client.setAccount(account);
                                            bank.addClients(client, account);
                                            checker=false;
                                            break;
                                        case"2":
                                            specialAccount=new SpecialAccount(balance,accountNumber);
                                            client=new Client(name,nationalID,address,phone,specialAccount);
                                            bank.addClients(client, specialAccount);
                                            checker=false;
                                            break;
                                        }
                                    }
                                    break;
                                case "2":
                                    System.out.println("client commircial Id");
                                    nationalID=scanner.nextInt();
                                    System.out.println("which type of Accounts you want to add"
                                    +"\n[1]Account\n[2]Special Account\n");
                                    option=scanner.next();
                                    if("2".equals(option)||"1".equals(option))                                
                                    {
                                        String accountNumber;
                                        int balance;
                                        System.out.println("account number");
                                        accountNumber=scanner.next();
                                        System.out.println("account balance");
                                        balance=scanner.nextInt();
                                        switch(option)
                                        {   
                                        case "1":
                                            account=new Account(balance,accountNumber);
                                            commercialClient=new CommercialClient(name,nationalID,address,phone,account);
                                            bank.addClients(commercialClient, account);
                                            checker=false;
                                            break;
                                        case"2":
                                            specialAccount=new SpecialAccount(balance,accountNumber);
                                            commercialClient=new CommercialClient(name,nationalID,address,phone,specialAccount);
                                            bank.addClients(commercialClient,specialAccount);
                                            checker=false;
                                            break;
                                        }
                                    }
                                    checker=false;
                                option1=true;
                                break;
                            }
                        }
                        }
                        break;
                    case"2":
                        bank.displayClients();
                        option1=true;
                        break;
                    case"3":
                        bank.displayAccounts();
                        option1=true;
                        break;
                    case"4":
                        System.out.println("Enter value");
                        int value=scanner.nextInt();
                        System.out.println("Enter Account number");
                        int accountNumber=scanner.nextInt();
                        bank.deposit(accountNumber, value);
                        option1=true;
                        break;
                    case"5":
                        System.out.println("Enter value");
                        int value1=scanner.nextInt();
                        System.out.println("Enter Account number");
                        int accountNumber1=scanner.nextInt();
                        bank.withdraw(accountNumber1, value1);
                        option1=true;
                        break;
                    case"6":
                        option1=false;
                        break;
                    
                }
            }
    }
}
