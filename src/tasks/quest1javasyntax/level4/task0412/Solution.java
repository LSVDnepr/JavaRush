package tasks.quest1javasyntax.level4.task0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Положительное и отрицательное число:
    Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить число на экран.
3. Если введенное число положительное, необходимо увеличить его в два раза и вывести.
4. Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
5. Если введенное число равно нулю, необходимо вывести ноль.
     */

    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            int n=Integer.parseInt(br.readLine());
            System.out.println((n>0)?n*2:((n<0)?n+1:0));
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
