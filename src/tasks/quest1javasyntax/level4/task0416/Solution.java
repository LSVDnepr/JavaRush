package tasks.quest1javasyntax.level4.task0416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    /*
    Задача: Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

Пример для числа 2.5: зелёный
Пример для числа 3: жёлтый
Пример для числа 4: красный
Пример для числа 5: зелёный


Требования:
1. Программа должна считывать вещественное число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если горит зелёный цвет, необходимо вывести текст: "зелёный"
4. Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
5. Если горит красный цвет, необходимо вывести текст: "красный"
     */

    public static void main(String[] args) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            double t=Double.parseDouble(br.readLine());
            if (t<0)throw new IllegalArgumentException("Time cannot be negative!");
            double d=t%5;
            System.out.println((d<3)?"зеленый":(d<4)?"желтый":"красный");
        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
