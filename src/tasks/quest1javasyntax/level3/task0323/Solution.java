package tasks.quest1javasyntax.level3.task0323;

public class Solution {
    /*
    Задача: Не думать о секундах…
    Реализуй метод getCountSecondsPassedInCurrentHour(int seconds).
    Метод на вход принимает целое число секунд, которые прошли с начала текущих суток.
    Нужно найти количество секунд, прошедших с начала последнего часа, и вернуть это число.

Пример:
Метод getCountSecondsPassedInCurrentHour вызывается с параметром 12345.

Пример вывода:
1545


Требования:
1. Метод getCountSecondsPassedInCurrentHour(int) должен быть публичным и статическим.
2. Метод getCountSecondsPassedInCurrentHour должен возвращать значение типа int.
3. Метод getCountSecondsPassedInCurrentHour не должен ничего выводить на экран.
4. Метод getCountSecondsPassedInCurrentHour должен правильно возвращать количество секунд, прошедших с начала последнего часа.
     */

    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        if (seconds<0)throw new IllegalArgumentException("Illegal value: time cannot be negative!");
        int hours=seconds/60/60;
        //System.out.println("hours="+hours);
        return (seconds-hours*60*60);

    }



}
