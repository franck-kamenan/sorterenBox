package be.intecbrussel.opdrachten.sorting;

import java.util.*;

public class BoxApp {

    public static void main(String[] args) {

        Box box1 = new Box(100, 100, 100);
        Box box2 = new Box(30, 5, 8);
        Box box3 = new Box(8, 15, 11);

        TreeSet<Box> boxSet = new TreeSet<>();
        boxSet.add(box1);
        boxSet.add(box2);
        boxSet.add(box3);

        boxSet.forEach(System.out::println); // Van kleinste naar grootste.

        TreeSet<Box2> boxSet2 = new TreeSet<>(new Comparator<Box2>(){
            @Override
            public int compare(Box2 o1, Box2 o2){
                return o1.getVolume() - o2.getVolume();
            }
        });


        boxSet2.add(new Box2(100, 100, 100));
        boxSet2.add(new Box2(30, 5, 8));
        boxSet2.add(new Box2(8, 15, 11));

        System.out.println("-----");
        boxSet.forEach(System.out::println); // Van kleinste naar grootste.
    }
}
