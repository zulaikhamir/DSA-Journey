//consider a situation where we have to sort a large number of elements which are uniformly distributed over a range. In such cases, Bucket Sort can be an efficient sorting algorithm. The idea is to divide the range into several buckets and then sort each bucket individually. Finally, we concatenate the sorted buckets to get the final sorted array.
//consider a situation where we have floating point numbers are uniformly distributed over a range. In such cases, Bucket Sort can be an efficient sorting algorithm. The idea is to divide the range into several buckets and then sort each bucket individually. Finally, we concatenate the sorted buckets to get the final sorted array.
//why are other sorting algorithms not efficient in this case? Because they do not take advantage of the uniform distribution of the elements. For example, Quick Sort and Merge Sort have a time complexity of O(n log n) in the average case, but Bucket Sort can achieve a time complexity of O(n) when the elements are uniformly distributed.
//why counting and radix sort are not efficient in this case? Because they are not suitable for floating point numbers. Counting Sort is only efficient for integers within a limited range, and Radix Sort is more complex and less efficient for floating point numbers compared to Bucket Sort.

//steps for bucket sort:
//1. Create an empty array of buckets (lists).
//2. Iterate through the input array and distribute the elements into the appropriate buckets based on their value.
//3. Sort each bucket individually using a suitable sorting algorithm (like Insertion Sort).
//4. Concatenate the sorted buckets to get the final sorted array.

public class BucketSort {
    public static void bucketSort(float[] arr, int numBuckets) {
        // Step 1: Create empty buckets
        List<Float>[] buckets = new List[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 2: Distribute elements into buckets
        for (float value : arr) {
            int bucketIndex = (int) (value * numBuckets); // Assuming values are in the range [0, 1)
            if (bucketIndex >= numBuckets) {
                bucketIndex = numBuckets - 1; // Handle edge case for value == 1.0
            }
            buckets[bucketIndex].add(value);
        }

        // Step 3: Sort each bucket and concatenate
        int index = 0;
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket); // Using built-in sort for simplicity
            for (float value : bucket) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f};
        int numBuckets = 5; // Number of buckets to use
        bucketSort(arr, numBuckets);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
