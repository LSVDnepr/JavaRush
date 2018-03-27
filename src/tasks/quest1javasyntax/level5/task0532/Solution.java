package tasks.quest1javasyntax.level5.task0532;
/*
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int calc = Integer.parseInt(reader.readLine());
            if (calc <= 0) throw new IllegalArgumentException("numbers quantity must be greater than 0!");
            int maximum = Integer.MIN_VALUE;
            for (int i = 0; i < calc; i++) {
                int num = Integer.parseInt(reader.readLine());
                if (num > maximum) maximum = num;
            }
            System.out.println(maximum);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
