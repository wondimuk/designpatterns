package sorting.insertion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Insertion Sort
* What -sorting algorithm that sorts collection element placing element in a sorted order in each iteration.
*       The idea behind the insertion sort is that first take one element, iterate it through the sorted array
* Why - Simple, and best for small data set
* When - small data set
* Complexity - O(n^2)*/
public class InsertionSort {

    public static List sort(List<Integer> list) {
        //In place insertion
        if (list.size() < 2) return list;
        for (int i = 1; i < list.size(); i++) {
            int smallestIndex = smallestIndex(list, i);
            if(smallestIndex >= 0) {
                list.add(smallestIndex, list.get(i)); //Add the ith smallest before the smallest index
                list.remove(i+1);  //delete the ith element since added to the smallest index
            }

        }
        return list;
    }

    public static Integer smallestIndex(List<Integer> list, int currIndex) {
        int smallestIndex = -1;
        Integer smallest = list.get(currIndex);
        for (int j = currIndex-1; j >= 0; j--) {
            if (smallest < list.get(j)) {
                smallestIndex = j;
            }
        }
        return smallestIndex;
    }
    public static void main(String[] args) {
        List<Integer> sort = new ArrayList<>(Arrays.asList(3,44,38,5,47,15,36,26,27,2,4,46,19,50,48,60));
        System.out.print("\nUnsorted array: ");
        sort.forEach(elem -> System.out.print(elem+" ") );
        sort(sort);
        System.out.print("\nSorted array: ");
        sort.forEach(elem -> System.out.print(elem+" "));
    }
}
