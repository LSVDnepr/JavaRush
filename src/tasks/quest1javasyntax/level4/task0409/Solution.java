package tasks.quest1javasyntax.level4.task0409;

public class Solution {
    /*
    Задача: Ближайшее к 10
    Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.


Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println() или System.out.print().
3. Метод main должен вызывать метод closeToTen только два раза.
4. Метод closeToTen должен вызывать метод abs.
5. Метод closeToTen должен выводить число на экран согласно заданию.
     */

    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        System.out.println(abs(10-a)<=(abs(10-b))?a:b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

}
