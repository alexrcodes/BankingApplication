package com.company;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;


    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber){
        //From either an instance method or a constructor, you can refer to any member of the current object using the this. keyword
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    //Deposit Method/Function
    public void DepositMoney(double DepositedMoney){
        this.Balance+=DepositedMoney;      //incremented our balance by adding our deposited amount to our current balance.
        System.out.println("Deposit is Successful, new Balance is " +this.Balance);
    }

    //Withdraw Method/Function
    public void WithdrawMoney(double WithdrawalMoney){
        if(this.Balance - WithdrawalMoney < 0){         // checks to see if the withdrawal money is enough to withdraw or not.
            System.out.println("Withdraw Unsuccessful only " + this.Balance+" is left");
        }else {
            this.Balance-=WithdrawalMoney;      // we have reduced our current balance, giving us our withdrawal money amount.
            System.out.println("Withdrawal successful, Current Balance is " +this.Balance);
        }
    }

    //Created Getters and Setters to return the value of attribute and take parameters and assign it to the attribute, respectively.
    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
