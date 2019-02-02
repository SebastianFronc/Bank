package com.company;

public class CorporateAccount extends Account {

    private long NIP;
    private long REGON;

    public CorporateAccount(long numberAccount, String nameAccount, accountType type, long NIP, long REGON) {
        super(numberAccount, nameAccount, type);
        this.NIP = NIP;
        this.REGON = REGON;
    }

    @Override
    public String toString() {
        return  super.toString() + "CorporateAccount{" +
                "NIP=" + NIP +
                ", REGON='" + REGON + '\'' +
                '}';
    }

    public long getNIP() {
        return NIP;
    }

    public void setNIP(long NIP) {
        this.NIP = NIP;
    }

    public long getREGON() {
        return REGON;
    }

    public void setREGON(long REGON) {
        this.REGON = REGON;
    }

    public accountType whatType(){
        return getType();


    }
}
