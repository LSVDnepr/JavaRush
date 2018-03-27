package tasks.quest1javasyntax.level5.task0528;
/*
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Требования:
1. Дата должна содержать день, месяц и год, разделенные пробелом.
2. День должен соответствовать текущему.
3. Месяц должен соответствовать текущему.
4. Год должен соответствовать текущему.
5. Вся дата должна быть выведена в одной строке.
 */

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.printf("%d %02d %d", today.getDayOfMonth(), today.getMonthValue(), today.getYear());
    }
}
