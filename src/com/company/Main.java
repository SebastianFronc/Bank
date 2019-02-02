package com.company;

public class Main {

    public static void main(String[] args) {

    PersonalAccount personalAccountOne = new PersonalAccount(123445, "konto", accountType.PERSONAL);
    CorporateAccount corporateAccountOne = new CorporateAccount(123145, "sdfsdf",
            accountType.CORPORATE, 123213, 45354 );

    personalAccountOne.insertMoney(32352);
    System.out.println(personalAccountOne.toString());
    personalAccountOne.withdrawMoney(999);
    System.out.println(personalAccountOne.toString());
    personalAccountOne.close();

    }
}
