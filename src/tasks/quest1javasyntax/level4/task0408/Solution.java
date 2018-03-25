package tasks.quest1javasyntax.level4.task0408;

public class Solution {
    /*
    Задача: Хорошо или плохо?
    Реализовать метод compare(int a).
Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5,
выводить строку "Число больше 5", если параметр метода больше 5,
выводить строку "Число равно 5", если параметр метода равен 5.

Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод main должен вызывать метод compare только три раза.
4. Метод compare должен быть void.
5. Метод compare должен выводить текст на экран согласно заданию.
     */

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        System.out.println(a<5?"Число меньше 5":a>5?"Число больше 5":"Число равно 5");
    }






}