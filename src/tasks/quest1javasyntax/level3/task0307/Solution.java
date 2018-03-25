package tasks.quest1javasyntax.level3.task0307;

public class Solution {
    /*
    Задача: Привет Starcraft!
    Создать 10 зергов, 5 протоссов и 12 терран.
    Дать им всем уникальные имена.

Требования:
1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
4. Нельзя изменять классы Zerg, Protoss и Terran.
     */

    public static void main(String[] args) {
        Zerg[] zergs=new Zerg[10];

        for (int i=0;i<zergs.length;i++){
            zergs[i]=new Zerg();
            zergs[i].name="zerg"+i;
        }
        Protoss[] protosses=new Protoss[5];

        for (int i=0;i<protosses.length;i++){
            protosses[i]=new Protoss();
            protosses[i].name="protoss"+i;
        }

        Terran[] terrans=new Terran[12];
        for (int i=0;i<terrans.length;i++){
            terrans[i]=new Terran();
            terrans[i].name="terran"+i;
        }

        for (Zerg z:zergs){
            System.out.print(z.name+" ");
        }
        System.out.println();

        for (Protoss p:protosses){
            System.out.print(p.name+" ");
        }
        System.out.println();
        for (Terran t:terrans){
            System.out.print(t.name+" ");
        }
        System.out.println();

    }



    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }


}
