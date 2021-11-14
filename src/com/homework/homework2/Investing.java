/*Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
        Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
        300$ в месяц Ваня тратит на еду и развлечения.
        10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
        Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
        Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
   600 - 300 - 10%(2% в мес) ---> 38 мес*/

package com.homework.homework2;

public class Investing {

    public static void main(String[] args) {
        double totalMoney = 0;
        double salary = 600;
        double brokerAccount = 0;

        for (int i = 1; i <= 38; i++) {
            switch (i) {
                case 7,13,19,25,31,37 -> salary += 400;
            }
            double monthTemptemporary = salary;
            brokerAccount += monthTemptemporary / 10;
            brokerAccount *= 1.02;
            monthTemptemporary -= salary / 10;
            totalMoney += monthTemptemporary;
            totalMoney -= 300;
        }

        System.out.println("Стало у Вани денег через 3 года и 2 мес: " + Math.round(totalMoney)+"$");
        System.out.println("Дополнительно на счету у его брокера: " + Math.round(brokerAccount)+"$");
    }
}
