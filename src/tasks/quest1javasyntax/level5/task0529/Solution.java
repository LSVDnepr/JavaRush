package tasks.quest1javasyntax.level5.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем регистре и нажмет Enter.
3. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
4. Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
5. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
6. Программа должна выводить текст на экран.
 */
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            String line;
            while (!(line=br.readLine()).equals("сумма")){
                sum+=Integer.parseInt(line);
            }
            System.out.println(sum);
        } catch (IOException io) {
            io.printStackTrace();
        }catch (NumberFormatException ne){
            System.out.println("Введенное значение не является числом или словом \"сумма\"");
            ne.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

    }

}
