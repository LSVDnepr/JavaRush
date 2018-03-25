package tasks.quest1javasyntax.level4.task0413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: День недели
    Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
     */

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String weekDay = "";
            switch (n) {
                case 1:
                    weekDay = "понедельник";
                    break;
                case 2:
                    weekDay = "вторник";
                    break;
                case 3:
                    weekDay = "среда";
                    break;
                case 4:
                    weekDay = "четверг";
                    break;
                case 5:
                    weekDay = "пятница";
                    break;
                case 6:
                    weekDay = "суббота";
                    break;
                case 7:
                    weekDay = "воскресенье";
                    break;
                default:
                    weekDay = "такого дня недели не существует";
            }
            System.out.println(weekDay);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
