package tasks.quest1javasyntax.level0.task0107;

public class Solution {
    /* Задача : "Комментарии излишни"
    Раскомментируй некоторые строчки, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).

Требования:
1. Программа должна выводить на экран числа 12 и 2.
2. Нельзя изменять строки с объявлением переменных.
3. Программа должна содержать только две переменные типа int.
4. Нельзя изменять строки отвечающие за вывод в консоль.
5. Нужно раскомментировать необходимые строки и не менять остальные.
     */

    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //x = x * 3;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }



}