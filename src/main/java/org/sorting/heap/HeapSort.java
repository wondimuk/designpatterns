package sorting.heap;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/*What - A heap is a complete binary tree, and the binary tree is a tree in which the node can have the utmost two children.
        Heap sort processes the elements by creating the min-heap or max-heap using the elements of the given array.
        Heap sort processes the elements by creating the min-heap or max-heap using the elements of the given array.
        Two operations:
            - Build the heap using given array elements
            - Repeatedly delete the root element
            Heap sort basically recursively performs two main operations -
* Why -
* When -
* Complexity - O(nlogn)*/
public class HeapSort {

    static class HeapNode {
        HeapNode leftNode;
        HeapNode rightNode;
        Integer value;

        HeapNode(Integer value){
            this.value = value;
        }

        HeapNode(Integer value, HeapNode leftNode, HeapNode rightNode){
            this.rightNode = rightNode;
            this.leftNode = leftNode;
            this.value = value;
        }

    }

    public List<Integer> buildHeap(List<Integer> list){
        HeapNode heap = new HeapNode(list.get(0));
        for(int i = 1; i<list.size()-1; i++){
            int leftRootValueIndex = 2*i+1;
            int rightRootValueIndex = 2*i+2;
            heap.leftNode = new HeapNode(list.get(leftRootValueIndex), null, null);
            heap.rightNode = new HeapNode(list.get(rightRootValueIndex), null, null);
            heapify(heap);
        }

        return list;
    }

/*Heapify - will get the heap and rearrange until reaching left leaf and right leaf*/
    public HeapNode heapify(HeapNode heapNode){
        if (heapNode == null) {
            return heapNode;
        } else {
            //Compare left with root
            //compare right with root
            //swap if child node is greater than root node.
        }
        heapify(heapNode.leftNode);
        heapify(heapNode.rightNode);
        return heapNode;
    }


}


