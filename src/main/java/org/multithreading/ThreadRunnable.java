package org.multithreading;

public class ThreadRunnable implements Runnable{
    Thread thread;
    private String instanceVariable;

    ThreadRunnable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }
    @Override
    public void run() {
        System.out.println("Thread running" + instanceVariable);
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            System.out.println(instanceVariable);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
    public void start() {
        System.out.println("Thread started");
        if (thread == null) {
            thread = new Thread(this, instanceVariable);
            thread.start();
        }
    }
}


