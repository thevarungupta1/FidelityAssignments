package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

abstract class Account {
    private int accountNumber;
    private String name;
    protected int currentBalance;

    public Account(int accountNumber, String name, int currentBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.currentBalance = currentBalance;
    }

    public void accountDetails() {
        System.out.println("Created Account Number is :" + " " + accountNumber);
        System.out.println("Name in Account is :" + " " + name);
        System.out.println("Balance in account is :" + " " + currentBalance);
    }

    public void accountDeposit() {
        System.out.println("Account Deposit");
    }

    public void accountWithdraw() {
        System.out.println("Account Withdraw");
    }

}

final class currentAccount extends Account {
    final int minBalance = 500;


    public currentAccount(int accountNumber, String name, int currentBalance) {
        super(accountNumber, name, currentBalance);
    }

    public void accountDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit in current account:");
        int depositamount = sc.nextInt();
        currentBalance = currentBalance + depositamount;
        System.out.println("Current Account Total Balance:" + currentBalance);
    }

    public void accountWithdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw from account:");
        int withdrawamount = sc.nextInt();
        currentBalance = currentBalance - withdrawamount;
        if (currentBalance >= minBalance)
            System.out.println("After withdrawing total balance is :" + currentBalance);
        else System.out.println("Balance is less than min balance of" + minBalance + ", Please check");
    }

}

final class savingAccount extends Account {
    final int minBalance = 1000;

    public savingAccount(int accountNumber, String name, int currentBalance) {
        super(accountNumber, name, currentBalance);
    }

    public void interestcal() {
        System.out.println("Interest at end of month on balance:" + (0.04 * currentBalance));
    }

    public void accountDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit in savings account:");
        int depositamount = sc.nextInt();
        currentBalance = currentBalance + depositamount;
        System.out.println("Saving Account Total Balance:" + currentBalance);
    }

    public void accountWithdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw from account:");
        int withdrawamount = sc.nextInt();
        currentBalance = currentBalance - withdrawamount;
        if (currentBalance >= minBalance)
            System.out.println("After withdrawing total balance is :" + currentBalance);
        else System.out.println("Balance is less than min balance of" + minBalance + ", Please check");
    }
}

public class Day5_Bankdetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice of you account: ");
        String accType = sc.nextLine();


        if (accType.equalsIgnoreCase("current")) {
            currentAccount ca = new currentAccount(ThreadLocalRandom.current().nextInt(10000, 99999), "curracc1", 50000);
            ca.accountDetails();
            ca.accountDeposit();
            ca.accountWithdraw();
        } else if (accType.equalsIgnoreCase("saving")) {
            savingAccount sa = new savingAccount(ThreadLocalRandom.current().nextInt(10000, 99999), "savacc1", 33000);
            sa.accountDetails();
            sa.interestcal();
            sa.accountDeposit();
            sa.accountWithdraw();
        } else {
            System.out.println("Please select correct account option");
        }


    }

}