class Solution {
    static void subsets(int index,int[] arr,ArrayList<Integer> curr,List<List<Integer>> alist ,int n){
        if(index == n){
           // System.out.println(curr);
            alist.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(arr[index]);
        subsets(index+1,arr,curr,alist,n);
        curr.remove(curr.size()-1);
        subsets(index+1,arr,curr,alist,n);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        List<List<Integer>> alist = new ArrayList<>();
        subsets(0,nums,curr,alist,nums.length);
        return alist;
    }
}