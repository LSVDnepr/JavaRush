package tasks.quest1javasyntax.level3.task0303;

public class Solution {
    /*
    Задача: Обмен валют
    Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Требования:
1. Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
2. Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
3. Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
4. Метод convertEurToUsd не должен ничего выводить на экран.
     */


    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100,0.98));
        System.out.println(convertEurToUsd(25,0.97));
    }

    public static double convertEurToUsd(int eur, double course) {
       return (eur*course);
    }


}