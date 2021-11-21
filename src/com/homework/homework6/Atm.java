package com.homework.homework6;

import java.util.Arrays;

public class Atm {

    private final Banknote[] banknotesInsideATM;
    final int INFINITY = 1000000000;

    public Atm(Banknote... banknotesInside) {
        this.banknotesInsideATM = (banknotesInside);
    }

    private Banknote[] withdrawMoney(int withdrawAmount) {
        Banknote[] optionsList = initializeBanknotes(withdrawAmount + 1);

        for (int i = 1; i <= withdrawAmount; i++) {
            for (Banknote banknote : banknotesInsideATM) {
                int denomination = banknote.getDenomination();
                int currentBanknotesCount = optionsList[i].getBanknotesCount();
                if (i >= denomination) {
                    int previousBanknotesCount = optionsList[i - denomination].getBanknotesCount();
                    if (previousBanknotesCount + 1 < currentBanknotesCount) {
                        optionsList[i].setBanknotesCount(previousBanknotesCount + 1);
                        optionsList[i].setDenomination(denomination);
                    }
                }
            }
        }

        Banknote[] banknotesResult = null;
        if (optionsList[withdrawAmount].getBanknotesCount() == INFINITY) {
            System.out.println("Требуемую сумму невозможно выдать имеющимися в наличии банкнотами!");
        } else {
            while (withdrawAmount > 0) {
                for (Banknote value : banknotesInsideATM) {
                    int banknote = value.getDenomination();
                    if ((withdrawAmount - banknote) >= 0) {
                        if (optionsList[withdrawAmount - banknote].getBanknotesCount() == optionsList[withdrawAmount].getBanknotesCount() - 1) {
                            if (value.getBanknotesCount() > 0) {
                                value.takeAwayBanknotes(1);
                                banknotesResult = addBanknoteToArray(banknote, banknotesResult);
                                withdrawAmount -= banknote;
                                break;
                            }
                            if (optionsList[withdrawAmount - banknote].getTotalAmount() <= withdrawAmount) {
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return banknotesResult;
    }

    private Banknote[] initializeBanknotes(int countBanknotes) {
        Banknote[] result = new Banknote[countBanknotes + 1];
        result[0] = new Banknote(0, 0);
        for (int i = 1; i < countBanknotes; i++) {
            result[i] = new Banknote(0, INFINITY);
        }
        return result;
    }

    public boolean checkAndPrintWithdrawResult(int howMuchToWithdraw) {
        boolean result = false;
        printCurrentBanknotes();
        System.out.println("Вы запросили для снятия: " + howMuchToWithdraw);

        if (getTotalMoneyInsideAtm() < howMuchToWithdraw) {
            System.out.println("В банкомате недостаточно денег, максимально доступная сумма: " + getTotalMoneyInsideAtm());
        } else if (getTotalMoneyInsideAtm() == howMuchToWithdraw) {
            for (Banknote banknote : banknotesInsideATM) {
                if (banknote.getBanknotesCount() > 0) {
                    System.out.println("Выдаю " + banknote.getBanknotesCount() + " банкнот(ы), номиналом: " + banknote.getDenomination() + "р");
                    banknote.takeAwayBanknotes(banknote.getBanknotesCount());
                }
            }
            printCurrentBanknotes();
            result = true;

        } else {
            Banknote[] banknotesToWithdraw = withdrawMoney(howMuchToWithdraw);
            if (banknotesToWithdraw == null) {
                System.out.println("В банкомате недостаточно купюр необходимого номинала! Попробуйте указать меньшую сумму");
            } else {
                if (banknotesToWithdraw.length > 0) {
                    System.out.println("Операция успешна!");
                    for (Banknote banknote : banknotesToWithdraw) {
                        System.out.println("Выдаю " + banknote.getBanknotesCount() + " банкнот(ы), номиналом: " + banknote.getDenomination() + "р");
                    }
                    printCurrentBanknotes();
                    result = true;
                }
            }
        }

        return result;
    }

    private Banknote[] addBanknoteToArray(int banknoteDenomination, Banknote... banknotes) {
        if (banknotes == null) {
            Banknote[] result = new Banknote[1];
            result[result.length - 1] = new Banknote(banknoteDenomination, 1);
            return result;
        } else if (banknotes[banknotes.length - 1].getDenomination() == banknoteDenomination) {
            banknotes[banknotes.length - 1].putBanknotes(1);
            return banknotes;
        } else {
            Banknote[] result = Arrays.copyOf(banknotes, banknotes.length + 1);
            result[result.length - 1] = new Banknote(banknoteDenomination, 1);
            return result;
        }
    }

    public void printCurrentBanknotes() {
        System.out.println();
        System.out.println("В банкомате сейчас: " + getTotalMoneyInsideAtm());
        if (isNotEmptyAtm()) {
            for (Banknote banknote : banknotesInsideATM) {
                if (banknote.getBanknotesCount() > 0) {
                    System.out.println(banknote.getBanknotesCount() + " банкнот(ы) номиналом " + banknote.getDenomination());
                }
            }
        } else {
            System.out.println("Пусто ¯\\_(ツ)_/¯");
        }
        System.out.println();
    }

    private boolean isNotEmptyAtm() {
        int sumInside = 0;
        for (Banknote banknote : banknotesInsideATM) {
            sumInside += banknote.getBanknotesCount() * banknote.getDenomination();
        }
        return (sumInside > 0);
    }

    public int getTotalMoneyInsideAtm() {
        int totalMoney = 0;
        for (Banknote banknote : banknotesInsideATM) {
            totalMoney += banknote.getTotalAmount();
        }
        return totalMoney;
    }

}
