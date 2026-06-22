//what is heapsort?
// Heapsort is a comparison-based sorting algorithm that uses a binary heap data structure. It works by first building a max heap (or min heap) from the input data, and then repeatedly extracting the maximum (or minimum) element from the heap and rebuilding the heap until all elements are sorted. The time complexity of heapsort is O(n log n), making it efficient for large datasets.
//Functions: heapify, buildMaxHeap, heapSort
// Array representation of a heap
// For a node at index i:

// Left child: 2*i + 1
// Right child: 2*i + 2
// Parent: (i-1)/2

// No pointers needed — it's just index math on a normal array.
//bottom up approach forward building will give garbage and top down approach will give garbage as well. We need to start from the last non-leaf node and heapify each node in reverse level order to build the max heap correctly. and why is that is because if we start from the last non-leaf node and heapify each node in reverse level order, we ensure that all the subtrees are properly heapified before we move up to the parent nodes. This way, when we heapify a parent node, we can be confident that its children are already in the correct heap order, allowing us to maintain the max heap property throughout the entire tree. If we were to start from the bottom up or top down without this approach, we might end up with a heap that does not satisfy the max heap property, leading to incorrect sorting results.

//where is heapsort used?
// Heapsort is used in various applications where efficient sorting is required, especially when dealing with large datasets. Some common use cases include:
// 1. Priority queues
// 2. Graph algorithms (e.g., Dijkstra's algorithm)
// 3. Memory management
// 4. External sorting (sorting data that does not fit into memory)
// Heapsort is an in-place sorting algorithm, meaning it does not require additional space for another array, making it memory efficient. However, it is not a stable sorting algorithm, as it may change the relative order of equal elements.
// Heapsort is an efficient sorting algorithm that uses a binary heap data structure to sort elements. It has a time complexity of O(n log n) and is an in-place sorting algorithm, meaning it does not require additional space for another array. However, it is not a stable sorting algorithm, as it may change the relative order of equal elements.
public class HeapSort {

    static void heapify(int[] arr, int n, int i) {//we are given an array, the size of the heap, and the index of the node to heapify
        int largest = i;// Initialize largest as root
        int left = 2 * i + 1;// left child index
        int right = 2 * i + 2;// right child index

        if (left < n && arr[left] > arr[largest]) {//left<n to ensure we are within the bounds of the heap, and arr[left] > arr[largest] to check if the left child is greater than the current largest
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {// If largest is not root, swap and continue heapifying
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    static void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {// Start from the last non-leaf node and heapify each node in reverse level order
            heapify(arr, n, i);
        }
    }

    static void heapSort(int[] arr) {
        int n = arr.length;
        buildHeap(arr, n);// Build heap (rearrange array)

        for (int end = n - 1; end > 0; end--) {// One by one extract elements from heap
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;
            heapify(arr, end, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        heapSort(arr);
        for (int x : arr) System.out.print(x + " ");
    }
}
