package tasks.quest1javasyntax.level3.task0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Большая и чистая
    Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя name1.
4. Выведенный текст должен содержать введенное имя name2.
5. Выведенный текст должен содержать введенное имя name3.
6. Выведенный тест должен полностью соответствовать заданию.
     */


    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String name1 = br.readLine();
            String name2 = br.readLine();
            String name3 = br.readLine();
            System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

        } catch (IOException e) {
            System.out.println("Couldn't read one of the names");
            e.printStackTrace();
        }
    }
}
