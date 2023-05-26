package org.collections.collections.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        Set linkedHashSettt = new LinkedHashSet();
        linkedHashSettt.add("AA");
        linkedHashSettt.add("BB");
        linkedHashSettt.add("CC");
        linkedHashSettt.add("DD");

        Iterator it = linkedHashSettt.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
