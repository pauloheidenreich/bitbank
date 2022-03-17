package com.company.functions;

import com.company.models.Accounts;

public class AccountOperations extends Accounts {

    @Override
    public void depositInAccount(double depositValue) {
        this.accountBalance += depositValue;
        System.out.println("Deposit accomplished with success.");
    }
}

