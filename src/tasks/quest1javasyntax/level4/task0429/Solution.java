package tasks.quest1javasyntax.level4.task0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел: 2  5  6
получим вывод:
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел: -2  -5  6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
     */

    public static void main(String[] args) {
        int number = 3;//сколько чисел надо ввести с клавиатуры
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int negative = 0;
            int positive = 0;
            for (int i = 0; i < number; i++) {
                int num = Integer.parseInt(br.readLine());
                if (num == 0) continue;
                if (num > 0) {
                    positive++;
                } else {
                    negative++;
                }
            }
            System.out.println("количество отрицательных чисел: " + negative);
            System.out.println("количество положительных чисел: " + positive);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}