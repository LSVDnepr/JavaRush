package tasks.quest1javasyntax.level5.task0519;

/*
Ходим по кругу
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color


Требования:
1. У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
2. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
3. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
4. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
 */
public class Circle {
    private int centreX;
    private int centreY;
    private int radius;
    private int width;
    private int color;

    public Circle(int centreX, int centreY, int radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
    }

    public Circle(int centreX, int centreY, int radius, int width) {
        this(centreX, centreY, radius);
        this.width = width;
    }

    public Circle(int centreX, int centreY, int radius, int width, int color) {
        this(centreX,centreY,radius,width);
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
