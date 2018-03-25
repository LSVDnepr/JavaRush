package tasks.quest1javasyntax.level2.task0206;

public class Solution {
    /*
    Задача: Считаем длину окружности
    Реализуй метод printCircleLength.
    Параметр метода - радиус окружности.
    Метод должен вывести на экран длину окружности, рассчитанной по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.


Требования:
1. В методе printCircleLength нужно вывести длину окружности, рассчитанной по формуле: 2 * Pi * radius.
2. Метод main должен вызывать метод printCircleLength с параметром 5.
3. Метод main не должен вызывать команду вывода текста на экран.
4. Программа должна выводить длину окружности с радиусом 5.
     */

    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double pi=3.14;
        double circleLength=2*pi*5;
        System.out.println(circleLength);
    }


}
