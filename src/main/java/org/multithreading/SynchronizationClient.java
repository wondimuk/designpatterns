package org.multithreading;

import org.multithreading.SynchronizationExample;

public class SynchronizationClient {

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample(Integer.valueOf(100));
        example.printValue();

        SynchronizationExample example1 = new SynchronizationExample(Integer.valueOf(9));
        example1.printValue1();
    }
}
