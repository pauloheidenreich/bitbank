package com.company.models;

public abstract class Accounts {

    public String expClientAccount;
    private int agencyNumber;
    private int accountNumber;
    protected double accountBalance = 0;
    private String clientAccount;

    public boolean withdrawFromAccount(double valueWithdraw){
        if (this.accountBalance >= valueWithdraw){
            this.accountBalance -= valueWithdraw;
            System.out.println("Withdraw accomplished with success.");
            return true;
        } else {
            System.out.println("Withdraw denied.");
            return false;
        }
    }
    public abstract void depositInAccount(double depositValue);

    public void transferFromAccount(double value, Accounts destinyAccount){
        if (this.withdrawFromAccount(value)){
            destinyAccount.depositInAccount(value);
            System.out.println("Transfer accomplished with success.");
        }
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
