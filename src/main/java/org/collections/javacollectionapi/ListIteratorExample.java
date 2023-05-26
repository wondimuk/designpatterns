package org.collections.javacollectionapi;

import java.util.*;

public class ListIteratorExample {

    public static void main(String[] args) {

        //List Iterator
        ListIterator itr = sampleArrayListExample().listIterator();

        //Forward iteration through the elements
        while (itr.hasNext()) {
            System.out.println("forward: " + itr.next());
            //lists.add("six"); //leads to currentModificationException
        }

        // Backward iteration through the elements
        while (itr.hasPrevious()) {
            //System.out.println("forward: " + itr.next());
            System.out.println("Backward: " + itr.previous());
            //lists.add("six"); //leads to currentModificationException
        }

    }

    private static List sampleArrayListExample(){
        List<String> lists = new ArrayList<>();
        lists.add("one");
        lists.add("two");
        lists.add("three");
        lists.add("four");
        lists.add("five");
        return lists;
    }

}
