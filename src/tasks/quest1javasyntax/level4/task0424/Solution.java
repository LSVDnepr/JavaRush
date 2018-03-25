package tasks.quest1javasyntax.level4.task0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Три числа
Ввод с клавиатуры, сравнение чисел и вывод на экран - у студентов 4 уровня секретного центра JavaRush эти навыки оттачиваются до автоматизма.
Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры.
Затем происходит сравнение, и если мы находим число, которое отличается от двух других, выводим на экран его порядковый номер.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
     */

    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=Integer.parseInt(br.readLine());
            System.out.print((a==b&&a!=c)?3:(b==c&&b!=a)?1:(a==c&&a!=b)?2:"");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
