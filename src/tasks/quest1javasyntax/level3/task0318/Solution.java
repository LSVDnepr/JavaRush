package tasks.quest1javasyntax.level3.task0318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: План по захвату мира
    Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.


Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число.
5. Выведенный текст должен полностью соответствовать заданию.
     */

    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            Integer year=Integer.parseInt(reader.readLine());
            String name=reader.readLine();
            System.out.println(name+" захватит мир через "+year+" лет. Му-ха-ха!");
        }catch (IOException e){
            System.out.println("Couldn't read name or age");
            e.printStackTrace();
        }
    }

}
