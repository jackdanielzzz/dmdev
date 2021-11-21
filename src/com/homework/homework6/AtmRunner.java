package com.homework.homework6;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class AtmRunner {

    public static void main(String[] args) {
        Banknote banknote500 = new Banknote(500, 10);
        Banknote banknote200 = new Banknote(200, 2);
        Banknote banknote100 = new Banknote(100, 2);
        Banknote banknote50 = new Banknote(50, 3);
        Banknote banknote10 = new Banknote(10, 5);
        Banknote banknote5 = new Banknote(5, 3);
        Banknote banknote1 = new Banknote(1, 3);
        Banknote[] banknotesForAtm = {banknote500, banknote200, banknote100, banknote50, banknote10, banknote5, banknote1};
        Atm atm = new Atm(banknotesForAtm);

        final int HOW_MUCH_TO_WITHDRAW = 3998;

        if (atm.checkAndPrintWithdrawResult(HOW_MUCH_TO_WITHDRAW)) {
            System.out.println("Все прошло успешно");
        } else {
            System.out.println();
            System.out.println("Сумму вывести не удалось");
        }
    }

}
