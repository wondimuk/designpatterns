package org.multithreading;

import org.multithreading.ThreadRunnable;

public class ThreadExample {

    public static void main(String[] args) {
        ThreadRunnable threads = new ThreadRunnable("Thread 1");
        threads.start();

        ThreadRunnable thread1 = new ThreadRunnable("Thread 2");
        thread1.start();
    }
}
