package tasks.quest1javasyntax.level4.task0441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution {
    /*
    Задача: Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
     */

    public static void main(String[] args) {
        int n=3;
        int[] ar=new int[n];
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            for (int i=0;i<n;i++){
                ar[i]=Integer.parseInt(br.readLine());
            }
            Arrays.sort(ar);
            System.out.println(ar[1]);
           /* int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=Integer.parseInt(br.readLine());*/

           // System.out.println(a+b+c-Math.min(Math.min(a,b),c)-Math.max(Math.max(a,b),c));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
