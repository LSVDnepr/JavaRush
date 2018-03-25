package tasks.quest1javasyntax.level4.task0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    /*
    Задача: Сортировка трех чисел
    Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Выведенные числа должны быть разделены пробелом.
4. Программа должна выводить числа в порядке убывания.
     */

    public static void main(String[] args) {
        int numsCalc = 3;
        int[] ar = new int[numsCalc];


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < ar.length; i++) {
                ar[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(ar);
            for (int i = ar.length - 1; i >= 0; i--) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
