package tasks.quest1javasyntax.level5.task0522;
/*
Максимум конструкторов
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Требования:
1. У класса должно быть хотя бы три переменные.
2. У класса должен быть конструктор по умолчанию.
3. У класса должен быть хотя бы один конструктор.
4. У класса должно быть хотя бы два конструктора.
5. У класса должно быть хотя бы три конструктора.
6. У класса должно быть хотя бы четыре конструктора.
 */
public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {
        this(5.0,4.0,1.0);
    }

    public Circle(double x) {
        this(x,4.0,1.0);

    }

    public Circle(double x, double y) {
        this(x,y,1.0);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public static void main(String[] args) {

    }
}
