package tasks.quest1javasyntax.level5.task0510;
/*
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Cat должна быть переменная name с типом String.
3. У класса Cat должна быть переменная age с типом int.
4. У класса Cat должна быть переменная weight с типом int.
5. У класса Cat должна быть переменная address с типом String.
6. У класса Cat должна быть переменная color с типом String.
7. У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 */
public class Cat {

    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        age=1;
        weight=2;
        color="black";
    }

    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        color="black";

    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        weight=2;
        color="black";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age=1;
    }

    public void initialize(int weight, String address, String color) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        age=1;
    }

    public static void main(String[] args) {

    }

}
