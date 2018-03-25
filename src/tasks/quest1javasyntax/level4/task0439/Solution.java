package tasks.quest1javasyntax.level4.task0439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    /*
    Задача: Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: "*имя* любит меня."

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.


Требования:
1. Программа должна считывать имя c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить 10 раз текст указанный в задании.
4. В программе должен использоваться цикл for.
     */

    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String name=br.readLine();
            for (int i=0;i<10;i++){
                System.out.println(name+" любит меня.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
