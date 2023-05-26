package org.multithreading;

public class SynchronizationExample {

    private Integer balance;

    public SynchronizationExample(Integer balance) {
        this.balance = balance;
    }

    public synchronized void printValue(){
        if(balance > 10){
            balance += 10;
        }else{
            balance *= 10;
        }
        System.out.println("Inside synchronized value balance="+balance);
    }

    public void printValue1(){
        balance = balance*2;
        synchronized (this){
            if(balance > 10){
                balance += 10;
            }else{
                balance *= 10;
            }
            System.out.println("Inside synchronized value balance="+balance);
        }

    }

}
