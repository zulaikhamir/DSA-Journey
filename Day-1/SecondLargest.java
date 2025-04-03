class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length<2) return -1;
        int n=arr.length;
        Arrays.sort(arr);
      
      for(int i=n-1;i>=0;i--){
          if(arr[i]<arr[n-1]){
              return arr[i];
          }
      }
        return -1;
    }

}
