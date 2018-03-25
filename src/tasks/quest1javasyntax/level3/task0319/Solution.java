package tasks.quest1javasyntax.level3.task0319;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Предсказание на будущее
    Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный тест должен полностью соответствовать заданию.
     */

    public static void main(String[] args) {
        try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            String name=reader.readLine();
            int salary=Integer.parseInt(reader.readLine());
            int years=Integer.parseInt(reader.readLine());
            System.out.println(name+" получает "+salary+" через "+years+" лет.");
        }catch (IOException io){
            System.out.println("Couldn't read name, salary or years");
            io.printStackTrace();
        }
    }

}
