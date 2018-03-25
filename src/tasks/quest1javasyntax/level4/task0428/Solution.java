package tasks.quest1javasyntax.level4.task0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*Задача:
    Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.

Примеры:
а) при вводе чисел: -4  6  6
получим вывод: 2

б) при вводе чисел: -6  -6  -3
получим вывод: 0

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
     */

    public static void main(String[] args) {
        int number = 3;//сколько чисел надо ввести с клавиатуры
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int calc = 0;
            for (int i = 0; i < number; i++) {
                int num = Integer.parseInt(br.readLine());
                if (num > 0) calc++;
            }
            System.out.println(calc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
