package tasks.quest1javasyntax.level5.task0502;

/*
    Задача: Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) = true,
то cat2.fight(cat1) = false


Требования:
1. Класс Cat должен содержать конструктор без параметров.
2. Класс Cat должен содержать публичные поля name, age, weight и strength.
3. Метод fight не должен считывать данные с клавиатуры.
4. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
5. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
6. Метод fight не должен выводить данные на экран.
     */
public class Cat {

    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int result1 = 0;
        int result2 = 0;

        if (this.strength != anotherCat.strength) {
            if (this.strength > anotherCat.strength) {
                result1++;
            } else {
                result2++;
            }
        }

        if (this.age != anotherCat.age) {
            if (this.age < anotherCat.age) {
                result1++;
            } else {
                result2++;
            }
        }

        if (this.weight != anotherCat.weight) {
            if (this.weight > anotherCat.weight) {
                result1++;
            } else {
                result2++;
            }
        }
        System.out.println(result1);
        System.out.println(result2);


        return (result1 > result2);

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.strength = 8;
        cat2.strength = 7;
        cat1.age = 3;
        cat2.age = 5;
        cat1.weight = 5;
        cat2.weight = 3;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }


}
