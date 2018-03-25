package tasks.quest1javasyntax.level4.task0418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран минимальное из двух целых чисел.
4. Если два числа равны между собой, необходимо вывести любое.
     */

    public static void main(String[] args) {
       try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
           int a=Integer.parseInt(br.readLine());
           int b=Integer.parseInt(br.readLine());
           System.out.println(a<=b?a:b);
       }catch (IOException e){
           e.printStackTrace();
       }
    }

}
