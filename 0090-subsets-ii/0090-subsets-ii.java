class Solution {

    static void subset(int index,int[] arr,List<List<Integer>> alist ,ArrayList<Integer> curr , int n){
        
        alist.add(new ArrayList<>(curr));
        for(int i=index;i<n;i++){
            if(i != index && arr[i]== arr[i-1])
                continue;
            curr.add(arr[i]);
            subset(i +1,arr,alist,curr,n);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> alist = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        subset(0,nums,alist,curr,n);
        return alist;
    }
}