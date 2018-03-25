package tasks.quest1javasyntax.level2.task0217;

public class Solution {
    /*
    Задача: Повторенье-мать
    Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.

Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать функцию System.out.println или System.out.print.
3. Метод print3 должен выводить текст на экран.
4. Метод main должен вызвать метод print3 только один раз.
5. Метод print3 должен выводить на экран строку 3 раза. Каждый раз с новой строки.
     */

    public static void print3(String s) {
        if (s==null)throw new IllegalArgumentException("Illegal value: string=null!");
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
