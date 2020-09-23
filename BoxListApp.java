package be.intecbrussel.opdrachten.sorting;

import java.util.*;

public class BoxListApp {

    public static void main(String[] args) {

        List<Box2> boxList = new ArrayList<>();
        boxList.add(new Box2(100, 100, 100));
        boxList.add(new Box2(8, 15, 30));
        boxList.add(new Box2(15, 3, 45));

        boxList.sort(new BoxComparator());
        boxList.forEach(System.out::println);
    }
}
