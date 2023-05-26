package org.collections.collections;

import java.util.*;

public class CopyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

         //Enumeration
        //Map
        //Set

        List<String> listCopy = new ArrayList<>(list.size());

        System.out.println("Size"+listCopy.size());

        //option 1:
        List<String> listCopy1 = new ArrayList<>(list);

        //Option 2: This is to copy the elements a list, in this example it will throw exception due to the
        //dest array list is not equal or greater than the source list
        Collections.copy(listCopy, list);

       // listCopy.add("seven");

        listCopy1.stream().forEach(aa->System.out.println("Element"+aa));


    }
}
