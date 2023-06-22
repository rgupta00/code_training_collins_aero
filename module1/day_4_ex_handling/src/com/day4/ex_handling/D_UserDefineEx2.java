package com.day4.ex_handling;

//SBM

//AccountCreationException
//NotSufficientExcetion
//OverFundException


/*
 * min balance for oping the a/c : 10000
 * u c'nat deopost more then 15L in saving account
 */
class Account{
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }


    public void deposit(double amount){
        balance=balance+amount;
    }


}
public class D_UserDefineEx2 {
    public static void main(String[] args) {

    }
}
