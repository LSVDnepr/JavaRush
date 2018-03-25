package tasks.quest1javasyntax.level4.task0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.
     */

    public static void main(String[] args){
      try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
          int a=Integer.parseInt(br.readLine());
          int b=Integer.parseInt(br.readLine());
          int c=Integer.parseInt(br.readLine());
          int d=Integer.parseInt(br.readLine());
          System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
      }catch (IOException e){
          e.printStackTrace();
      }
    }

}
