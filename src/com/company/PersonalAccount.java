package com.company;

public class PersonalAccount extends Account {

    public PersonalAccount(long numberAccount, String nameAccount, accountType type) {
        super(numberAccount, nameAccount, type);
    }

    public accountType whatType(){

        return getType();
    }
}
