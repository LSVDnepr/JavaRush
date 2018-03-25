package tasks.quest1javasyntax.level3.task0308;

public class Solution {
/*
    Задача: Произведение 10 чисел
    Вывести на экран произведение 10 чисел от 1 до 10.
    Результат - это 1 число.


Требования:
1. Программа должна выводить целое число на экран.
2. Метод main должен вызывать функцию System.out.println.
3. Выведенное число должно быть больше трех миллионов.
4. Выведенное число должно соответствовать заданию.
     */

    public static void main(String[] args) {
        //System.out.println(1*2*3*4*5*6*7*8*9*10);
        int factor=1;
        int limit=10;
        for (int i=1;i<=limit;i++){
            factor*=i;
        }
        System.out.println(factor);
    }

}
