package tasks.quest1javasyntax.level4.task0411;

public class Solution {
    /*
    Задача: Времена года на Терре
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна


Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать функцию System.out.println или System.out.print.
3. Метод main должен вызывать метод checkSeason только четыре раза.
4. Метод checkSeason должен быть static void, и иметь только один параметр int.
5. Метод checkSeason должен выводить текст на экран согласно заданию.
     */

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
       /* checkSeason2(12);
        checkSeason2(4);
        checkSeason2(7);
        checkSeason2(10);*/
    }

    public static void checkSeason(int month) {
        String season = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "На Терре нет такого времени года";
        }
        System.out.println(season);
    }

   /* public static void checkSeason2(int month) {
        if (month < 1 || month > 12) System.out.println("На Терре нет такого времени года");
        String season = ((month >= 3 && month < 6) ? "весна" : (month >= 6 && month < 9) ? "лето" : (month >= 9 && month < 12) ? "осень" : "зима");
        System.out.println(season);
    }*/


}
