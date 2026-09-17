//niave solution
//tc: o(n) and sc: o(n)

//Given an array of integers nums, and a pivot element p, partition the array at the pivot.
//leetcode link: https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
class solution {
    public int[] partitionArray(int[] nums, int l,int h,int p) {//p is pivot element,l is low and h is high
        int[] temp = new int[h-l+1];
        int index = 0;
        for(int i=l;i<=h;i++){
            if(nums[i]<=p){
                temp[index++] = nums[i];
            }
        }
        for(int i=l;i<=h;i++){
            if(nums[i]>p){
                temp[index++] = nums[i];
            }
        }
        for(int i=l;i<=h;i++){
            nums[i] = temp[i-l];
        }
        return nums;

    }
}
