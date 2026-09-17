// 350. Intersection of Two Arrays II
// This is a naive solution with O(m*n) time complexity. We can optimize it using two pointers since the arrays are sorted.
//The idea is to iterate through both arrays simultaneously and compare the elements. If they are equal, we add it to the result and move both pointers. If the element in nums1 is smaller, we move the pointer in nums1. If the element in nums2 is smaller, we move the pointer in nums2. we have to avoid duplicates in the result, so we can skip over duplicate elements in nums1 while iterating. This way we ensure that we only add unique elements to the result.
//example Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output:[2]
//The ssolution i have in notes works becacuse in that i am just printing and not storing anywhere quickly but here we have to store the result in an array and return it, so we have to make sure that we are not adding duplicates in the result array.
public class IntersectionOfTwoSortedArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
     int m = nums1.length;
     int n = nums2.length;
     int[] result = new int[Math.min(m, n)];
     int k = 0;
     for(int i = 0; i < m; i++){
        if(i>0 && nums1[i] == nums1[i-1]) continue;//to avoid duplicates in the result we chack i>0 becausaae of i-1
        for(int j = 0; j < n; j++){
            if(nums1[i] == nums2[j]){
                result[k++] = nums1[i];
                break;
            }
     }
    }
    return Arrays.copyOfRange(result, 0, k);

}
}

//efficeint solution
//o(m+n) time complexity
//approach: two pointers or merge sort approach  but it only works if the arrays are sorted, if they are not sorted we can sort them first and then apply this approach. we can also use hash map to store the frequency of elements in one array and then iterate through the other array to find the intersection but that would take O(m+n) time complexity and O(m) space complexity, so the two pointers approach is more efficient in terms of space complexity.

public class IntersectionOfTwoSortedArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] result = new int[Math.min(m, n)];
        while(i < m && j < n){
            if(i>0 && nums1[i] == nums1[i-1]) continue;
            if(nums1[i] == nums2[j]){
                result[k++] = nums1[i];
                i++;
                j++;
            } else if(nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(result, 0, k);
    }
}
