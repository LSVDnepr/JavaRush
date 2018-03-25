package tasks.quest1javasyntax.level4.task0442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
     */


    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            while (true) {
                int num = Integer.parseInt(br.readLine());
                sum += num;
                if (num == -1) {
                    System.out.println(sum);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
