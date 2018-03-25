package tasks.quest1javasyntax.level2.task0201;

public class Solution {
    /*
    Задача: Реализуем метод print
    Реализуй метод print. Метод должен вывести на экран переданную строку 4 раза. Каждый раз с новой строки.


Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод print должен выводить текст на экран.
4. Метод main должен вызвать метод print класса Solution ровно два раза.
5. Метод print должен выводить на экран строку 4 раза. Каждый раз с новой строки.
     */

    public static void main(String[] args) {
        print("Java easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        if (s==null) throw new IllegalArgumentException("Printed string mustn't be null!");
        for (int i=0;i<4;i++){
            System.out.println(s);
        }
    }





}
