package tasks.quest1javasyntax.level5.task0515;
/*
Инициализация объектов
Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Person должно быть 5 переменных.
3. У класса должен быть один метод initialize.
4. Метод initialize должен иметь пять параметров.
 */

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

   /* public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public void initialize(String name, int money, char sex) {
        this.name = name;
        this.money = money;
        this.sex = sex;
    }*/

    public void initialize(String name, char sex, int money, int weight, double size) {
        this.name = name;
        this.sex = (sex=='M'||sex=='F'||sex=='m'||sex=='f'?sex:'M');
        this.money = (money!=0?money:2500);
        this.weight = (weight!=0?weight:70);
        this.size = (size!=0?size:42);
    }

    public static void main(String[] args) {

    }
}
