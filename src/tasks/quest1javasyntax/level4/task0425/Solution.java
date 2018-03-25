package tasks.quest1javasyntax.level4.task0425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3

     */
    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            System.out.println((a>0)?((b>0)?1:4):(b>0)?2:3);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
