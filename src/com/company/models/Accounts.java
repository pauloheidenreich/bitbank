package com.company.models;

import com.company.functions.InsufficientBalanceException;

public abstract class Accounts {

    public String expClientAccount;
    private int agencyNumber;
    private int accountNumber;
    protected double accountBalance = 0;
    private String clientAccount;

    public void withdrawFromAccount(double valueWithdraw) throws InsufficientBalanceException {
        if (this.accountBalance < valueWithdraw) {
            throw new InsufficientBalanceException("Insufficient balance !");
        } else {
            this.accountBalance -= valueWithdraw;
            System.out.println("Withdraw accomplished with success.");
        }
    }
    public abstract void depositInAccount(double depositValue);

    public void transferFromAccount(double value, Accounts destinyAccount) throws InsufficientBalanceException {
            this.withdrawFromAccount(value);
            destinyAccount.depositInAccount(value);
            System.out.println("Transfer accomplished with success.");
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }
    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getClientAccount() {
        return clientAccount;
    }
    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }
}
