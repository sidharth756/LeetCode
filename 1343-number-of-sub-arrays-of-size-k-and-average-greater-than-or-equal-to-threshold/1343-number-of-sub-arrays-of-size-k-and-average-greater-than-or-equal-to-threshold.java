class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        Set<Integer> count = new HashSet<>(); 
        int count1 =0;
        for(int i=0;i<(n-k) + 1;i++){
            int sum =0;
            for(int j =i;j<i+k;j++){
                sum = sum + arr[j];
            }
            if(sum/k >= threshold){
                    count1++;
            }
            sum = 0;
        }
        return count1;
    }
}