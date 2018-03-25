package tasks.quest1javasyntax.level1.task0112;

import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    /*Задача: Выводим квадрат числа
    Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать данные с клавиатуры.
4. Программа должна выводить только значение квадрата считанного числа.
     */

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a*a);
    }



}
