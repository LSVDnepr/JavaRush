package tasks.quest1javasyntax.level4.task0432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Хорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв


Требования:
1. Программа должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Каждое значение должно быть выведено с новой строки.
4. Программа должна выводить на экран строку N раз.
5. В программе должен использоваться цикл while.
     */

    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String s=br.readLine();
            int n=Integer.parseInt(br.readLine());
            if (n<0)throw new IllegalArgumentException("n mustn't be negative");
            while (n>0){
                System.out.println(s);
                n--;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
