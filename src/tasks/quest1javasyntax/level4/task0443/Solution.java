package tasks.quest1javasyntax.level4.task0443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Как назвали, так назвали
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988


Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна выводить строки на экран.
3. Программа должна выводить текст, шаблон которого указан в задании.
4. Каждое предложение вывести с новой строки.
     */

    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            String name=br.readLine();
            int y=Integer.parseInt(br.readLine());
            int m=Integer.parseInt(br.readLine());
            int d=Integer.parseInt(br.readLine());
            System.out.println("Меня зовут "+name+".\nЯ родился "+d+"."+m+"."+y);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
