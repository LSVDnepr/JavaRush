package tasks.quest1javasyntax.level4.task0403;

public class Cat {
    private String name;

    public void setName(String name) {
        if (name==null) throw new IllegalArgumentException("String name is null! Recheck!");
        this.name=name;
    }

    public static void main(String[] args) {

    }
}
