package sorting.bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Bubble sort - is a simple sorting algorithm that compare adjacent element and swapped if unordered.
 * The step will continue until swapping stopped i.e. no swapping
 * Time complexity - O(n)=n^2
 * when to use - required to order elements ascending or descending */

public class BubbleSort {

    public static List sort(List<Integer> list){
        if(list.size()<=1) return list;
        boolean isSwapping;

        do {
            isSwapping = false;
            int size = list.size();
            Integer temp;
            for(int i=0; i < size-1; i++){
                if(list.get(i) > list.get(i+1)){
                    temp = list.get(i);
                    list.remove(i);
                    list.add(i+1,temp);
                    isSwapping = true;
                }
            }
        }while(isSwapping);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> sort = new ArrayList<>(Arrays.asList(3,44,38,5,47,15,36,26,27,2,46,4,19,50,48));
        sort(sort);
        sort.forEach(elem -> System.out.println(elem));
    }
}
