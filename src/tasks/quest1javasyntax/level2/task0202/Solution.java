package tasks.quest1javasyntax.level2.task0202;

public class Solution {
    /*
    Задача: Откуда берутся Person?
    В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.


Требования:
1. В классе Person объяви переменную name типа String.
2. В классе Person объяви переменную age типа int.
3. В классе Person объяви переменную weight типа int.
4. В классе Person объяви переменную money типа int.
5. В методе main создай объект Person и сразу присвой ссылку на него переменной person.
6. Должно быть объявлено 5 переменных.
     */

    public static void main(String[] args) {
        Person person=new Person("Lana",27,52,5000);
    }

    public static class Person {
        private String name;
        private int age;
        private int weight;
        private int money;

        public Person(String name, int age, int weight, int money) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.money = money;
        }
    }






}
