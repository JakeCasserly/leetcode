import java.util.ArrayList;
class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<Integer>();
    }

    private int parent(int i) {
        return (i-1)/2;
    }

    private int leftChild(int i) {
        return (i*2) + 1;
    }

    private int rightChild(int i) {
        return (i*2) + 2;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public int getSize() {
        return heap.size();
    }

    public void insert(int value) {
        // Add the new value at the end of the heap
        heap.add(value); 
      
        // Get the index of the newly added value
        int currentIndex = heap.size() - 1; 

        // Bubble up to restore heap property
        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parent(currentIndex))) {
            // Swap with parent if current value is greater
            swap(currentIndex, parent(currentIndex));
          
            // Move up to the parent index
            currentIndex = parent(currentIndex); 
        }
    }

    public int extractMax() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        // The maximum value is at the root
        int max = heap.get(0); 
      
        // Remove the last element
        int lastElement = heap.remove(heap.size() - 1); 

        if (!heap.isEmpty()) {
          
            // Move the last element to the root
            heap.set(0, lastElement); 

            // Bubble down to restore heap property
            int currentIndex = 0;
            while (true) {
                int left = leftChild(currentIndex);
                int right = rightChild(currentIndex);

                int largest = currentIndex;

                // Find the largest value among current, left child, and right child
                if (left < heap.size() && heap.get(left) > heap.get(largest)) {
                    largest = left;
                }

                if (right < heap.size() && heap.get(right) > heap.get(largest)) {
                    largest = right;
                }

                if (largest == currentIndex) {
                      // Heap property is restored
                    break; 
                }

                  // Swap with the largest child
                swap(currentIndex, largest); 
              
                  // Move down to the largest child's index
                currentIndex = largest; 
            }
        }

          // Return the maximum value
        return max; 
    }
    // Checks if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        MaxHeap theHeap = new MaxHeap();
        for (int i = 0; i < stones.length; i++) {
            theHeap.insert(stones[i]);
        }

        while (theHeap.getSize() > 1) {
            int largest = theHeap.extractMax();
            int nextLargest = theHeap.extractMax();
            int stoneLeft = largest - nextLargest;
            if (stoneLeft != 0) {
                theHeap.insert(stoneLeft);
            }
        }
        if (!theHeap.isEmpty()) {
            return theHeap.extractMax();
        }
        else {
            return 0;
        }
    }
}
