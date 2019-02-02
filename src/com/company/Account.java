package com.company;

public abstract class Account {

    private long numberAccount;
    private  String nameAccount;
    private long amount;
    private accountType type;
    private boolean ifOpen;

    public accountType getType() {
        return type;
    }

    public void setType(accountType type) {
        this.type = type;
    }


    public Account(long numberAccount, String nameAccount, accountType type) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.amount = 0;
        this.type = type;
        this.ifOpen = true;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }


    public void insertMoney (long insert){

        this.amount += insert;
    }

    public void withdrawMoney (long withdraw){

        this.amount -= withdraw;
    }

    public abstract accountType whatType ();

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", nameAccount='" + nameAccount + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }

    public void close(){
        this.ifOpen = false;
        System.out.println("ACCOUNT CLOSED");
    }

    public void getBonus(){
        this.amount +=100;
    }


    public void denomination() {
        this.amount = this.amount / (long) 1000;
    }

    public void changeAccountName(String newAccountName){
        this.nameAccount = newAccountName;

    }

}
