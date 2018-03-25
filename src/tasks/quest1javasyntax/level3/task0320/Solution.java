package tasks.quest1javasyntax.level3.task0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Скромность украшает программиста
    Ввести с клавиатуры имя и вывести надпись:
    name зарабатывает $5,000. Ха-ха-ха!

    Пример:
    Тимур зарабатывает $5,000. Ха-ха-ха!


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный тест должен полностью соответствовать заданию.
     */

    public static void main(String[] args) {
        try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            String name=reader.readLine();
            System.out.println(name+" зарабатывает $5,000. Ха-ха-ха!");
        }catch (IOException io){
            System.out.println("Couldn't read name");
            io.printStackTrace();
        }
    }




}
