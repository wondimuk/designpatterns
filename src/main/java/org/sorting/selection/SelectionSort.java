package sorting.selection;

import java.util.*;

/*Selection sort algorithm - Sorts the elements by finding the minimum element in the unsorted array and put it at the beginning.
                             Two sub-arrays maintained; the sorted sub array and the unsorted.
When to use - when the list is small and checking if every element is in a sorted order,
             & when memory space is limited since it makes minimum possible number of swaps
Time complexity - O(n) = n^2*/
public class SelectionSort {

    public static List sort(List<Integer> list){
        if(list.size()<2) return list;

       for(int i=0; i< list.size(); i++){
           Integer smallest = Integer.MAX_VALUE;
           Integer index = -1;
           boolean swap = false;
           for(int j=i+1; j < list.size(); j++){
               if(smallest > list.get(j)){
                   smallest = list.get(j);
                   index = j;
                   swap = true;
               }
           }
           if(swap) {
               list.add(index, list.get(i));
               list.remove(index + 1);
               list.remove(i);
               list.add(i, smallest);
           }
       }
       return list;
    }

    public static void main(String[] args) {
        List<Integer> sort = new ArrayList<>(Arrays.asList(3,44,38,5,47,15,36,26,27,2,4,46,19,50,48));
        sort(sort);
        sort.forEach(elem -> System.out.println(elem));
    }

}
