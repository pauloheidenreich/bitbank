package com.company.funtions;

public class InsufficientBalanceException extends Exception{ //Creating a Exception test for account balance before the operation
    public InsufficientBalanceException(String msg) { super (msg);}
}
