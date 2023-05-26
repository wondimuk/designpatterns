package org.collections.collections.set;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumIterator {

    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        Iterator it = weekdays.iterator();
        System.out.println("Week days are:");
        while(it.hasNext()){
            System.out.print(it.next()+",");
        }
    }
}
