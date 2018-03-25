package tasks.quest1javasyntax.level4.task0417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Существует ли пара?
    Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел 1  2  2
получим вывод: 2 2

б) при вводе чисел 2  2  2
получим вывод: 2 2 2

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
     */

    public static void main(String[] args){
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=Integer.parseInt(br.readLine());
            System.out.println(a==b?(a==c?a+" "+b+" "+c:a+" "+b):(b==c?b+" "+c:a==c?a+" "+c:""));
        }catch (IOException e){
            e.printStackTrace();
        }
    }




}
