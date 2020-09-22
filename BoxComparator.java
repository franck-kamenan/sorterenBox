package be.intecbrussel.opdrachten.sorting;

import java.util.*;

public class BoxComparator implements Comparator<Box2> {

    @Override
    public int compare(Box2 o1, Box2 o2) {
        return o1.getVolume() - o2.getVolume();
    }
}
