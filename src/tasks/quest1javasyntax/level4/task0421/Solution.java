package tasks.quest1javasyntax.level4.task0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Требования:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.
     */

    public static void main(String[] args)  {
       try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
           String name1=br.readLine();
           String name2=br.readLine();
           System.out.print(name1.equals(name2)?"Имена идентичны":(name1.length()==name2.length()?"Длины имен равны":""));
       }catch(IOException e){
           e.printStackTrace();
       }
    }



}
