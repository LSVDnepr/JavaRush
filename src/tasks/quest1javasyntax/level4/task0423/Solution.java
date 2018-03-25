package tasks.quest1javasyntax.level4.task0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
4. Если возраст меньше либо равно 20 ничего не выводить.
     */

    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String name=br.readLine();
            int age=Integer.parseInt(br.readLine());
            if (age>20) System.out.println("И 18-ти достаточно");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
