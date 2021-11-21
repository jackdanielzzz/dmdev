package com.homework.homework6;

public class Banknote {

    private int denomination;
    private int banknotesCount;

    public Banknote(int denomination, int banknotesCount) {
        this.denomination = denomination;
        this.banknotesCount = banknotesCount;
    }

    public int getTotalAmount() {
        return denomination * banknotesCount;
    }

    public int getDenomination() {
        return denomination;
    }

    public int getBanknotesCount() {
        return banknotesCount;
    }

    public void putBanknotes(int banknotesCount) {
        this.banknotesCount++;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public void setBanknotesCount(int banknotesCount) {
        this.banknotesCount = banknotesCount;
    }

    public int takeAwayBanknotes(int takeAwayCount) {
        this.banknotesCount -= takeAwayCount;
        return this.getDenomination() * takeAwayCount;
    }
}
