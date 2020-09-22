package be.intecbrussel.opdrachten.sorting;

import java.util.*;

public class BoxApp {

    public static void main(String[] args) {

        Box box1 = new Box(10, 10, 10);
        Box box2 = new Box(300, 50, 80);
        Box box3 = new Box(8, 15, 11);

        TreeSet<Box> boxSet = new TreeSet<>();
        boxSet.add(box1);
        boxSet.add(box2);
        boxSet.add(box3);

        System.out.println(box1.compareTo(box2));
    }
}
