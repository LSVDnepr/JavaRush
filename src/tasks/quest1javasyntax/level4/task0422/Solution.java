package tasks.quest1javasyntax.level4.task0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача:  18+
    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

Требования:
1. Программа должна дважды считать данные c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст меньше 18 вывести только сообщение "Подрасти еще".
4. Если возраст больше либо равно 18 ничего не выводить.
     */

    public static void main(String[] args)  {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String name=br.readLine();
            int age=Integer.parseInt(br.readLine());
            if (age<18) System.out.println("Подрасти еще");
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
