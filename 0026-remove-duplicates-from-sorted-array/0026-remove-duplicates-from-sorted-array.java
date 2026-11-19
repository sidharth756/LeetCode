class Solution {
    public int removeDuplicates(int[] arr) {
        int fast=0;
       int slow =0;
       for(fast=1;fast<arr.length;fast++){
           if(arr[slow]!=arr[fast]){
               slow++;
               arr[slow]= arr[fast];
           }
       }
       return slow+1;
    }
}