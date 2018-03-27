package tasks.quest1javasyntax.level5.task0531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. В классе должен быть метод public static min, принимающий 5 параметров типа int.
4. Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
5. Программа должна выводить строку, которая начинается на "Minimum = ".
6. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
 */
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int minimum = Integer.MAX_VALUE;
            for (int i = 0; i < 5; i++) {
                int a = Integer.parseInt(reader.readLine());
                minimum = min(a, minimum);
                // if (a<minimum)minimum=a;
            }
            System.out.println("Minimum = " + minimum);
        } catch (IOException io) {
            io.printStackTrace();
        }

    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
