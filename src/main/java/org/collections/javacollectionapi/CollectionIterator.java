package org.collections.javacollectionapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionIterator {
    public static void main(String[] args) {
        //Iterator
        Iterator iterator = sampleExample().iterator();

        // Collection iteration, forward only
        while (iterator.hasNext()) {
            System.out.println("Iterator forward: " + iterator.next());
            //c.add("six"); leads to concurrent modification exception
        }
    }

    private static Collection sampleExample() {
        Collection c = new LinkedHashSet();
        c.add("one");
        c.add("two");
        c.add("four");
        c.add("five");
        return c;
    }
}
