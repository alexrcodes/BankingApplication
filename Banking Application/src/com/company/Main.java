package com.company;

import com.sun.source.tree.ArrayAccessTree;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class Main {

    public static void main(String[] args) {
        Account AlexsAccount = new Account("121212", 0,"Alex","alext@xyz.com","1212121");

        //Performing action on the account
        AlexsAccount.DepositMoney(100);    //added $100
        AlexsAccount.DepositMoney(300);    //added $300
        AlexsAccount.WithdrawMoney(200);  //took $200 out
    }

    //Functionalities for Banking Application
    /* Customer Name, customer Account number,
       customer Email, Balance, Phone Number
       Deposit Money, Withdraw Money */
}
