package org.collections.javacollectionapi;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {
    public static void main(String[] args) {
        //Fail-safe
        ConcurrentHashMap<String, String> cc = sampleConcurrentMapExample();
        Iterator failSafeIterator = cc.keySet().iterator();
        while (failSafeIterator.hasNext()) {
            System.out.println("Fail Safe Iterator elements: " + failSafeIterator.next());
            cc.put("six", "6"); //Will not lead to concurrent modification exception
        }
    }

    private static ConcurrentHashMap<String, String> sampleConcurrentMapExample() {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        return map;
    }
}
