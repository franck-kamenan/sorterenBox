package be.intecbrussel.opdrachten.sorting;

import java.util.*;

public class BoxListApp {

    public static void main(String[] args) {

        //List<Box2> boxList = new ArrayList<>();
        /*boxList.add(new Box2(100, 100, 100));
        boxList.add(new Box2(8, 15, 30));
        boxList.add(new Box2(15, 3, 45))*/;

        /*boxList.sort(new BoxComparator());
        boxList.forEach(System.out::println);

        System.out.println("-----with lambda-----");
        boxList.sort(((o1, o2) -> o1.getVolume() - o2.getVolume()));
        boxList.forEach(System.out::println);*/

        List<Box> boxList = new ArrayList<>();
        boxList.add(new Box(100, 100, 100));
        boxList.add(new Box(8, 15, 30));
        boxList.add(new Box(15, 3, 45));

        boxList.sort(Comparator.comparingInt(Box::getVolume)); //method reference
        boxList.forEach(System.out::println);
    }
}
