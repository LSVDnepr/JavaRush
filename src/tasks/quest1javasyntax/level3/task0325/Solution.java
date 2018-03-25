package tasks.quest1javasyntax.level3.task0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Финансовые ожидания
    Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное число n.
4. Выведенный тест должен полностью соответствовать заданию.
     */

    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            int salaryPerHour=Integer.parseInt(br.readLine());
            System.out.println("Я буду зарабатывать $"+salaryPerHour+" в час");
        }catch (IOException io){
            System.out.println("Couldn't parse number");
            io.printStackTrace();
        }
    }

}
