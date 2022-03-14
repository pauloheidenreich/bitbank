package com.company.tests;

import com.company.funtions.AccountOperations;
import com.company.funtions.ClientsOperations;

public class AccountTest {
    public static void main(String[] args){
        ClientsOperations newClient = new ClientsOperations();
        newClient.setClientName("Paulo Heidenreich Jr");
        newClient.setClientCpf("970.941.030-00");
        newClient.setClintOccupation("Dev Java");

        AccountOperations newAccount = new AccountOperations();
        newAccount.setAgencyNumber(1234);
        newAccount.setAccountNumber(123456);
        newAccount.setAccountBalance(0);
        newAccount.expClientAccount = newClient.getClientName();

        System.out.println("Name: " + newClient.getClientName());
        System.out.println("CPF: " + newClient.getClientCpf());
        System.out.println("Occupation: " + newClient.getClintOccupation());
        System.out.println("Account Number: " + newAccount.getAccountNumber());
        System.out.println("Bank Agency: " + newAccount.getAgencyNumber());
        System.out.println("Account Balance: " + newAccount.getAccountBalance());

        //Functions test:
        System.out.println("A new $5000 deposit in client account");
        newAccount.depositInAccount(5000.00);
        System.out.println("The new account balance is: " + newAccount.getAccountBalance());
        System.out.println("Now, a $1000 withdraw from account.");
        newAccount.withdrawFromAccount(1000);
        System.out.println("The account balance after withdraw is: " + newAccount.getAccountBalance());

        //Creating a new account for a transfer simulation

        AccountOperations newAccount02 = new AccountOperations();
        newAccount02.setAccountBalance(0);
        System.out.println("The newAccount02 balance is: " + newAccount02.getAccountBalance());
        System.out.println("Transfering $1000 from newAccount to newAccount02");

        newAccount.transferFromAccount(1000, newAccount02);

        System.out.println("The newAccount02 balance is: " + newAccount02.getAccountBalance());
    }
}
