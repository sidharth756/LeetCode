class Solution {

    static void combination(int index,int[] arr, List<List<Integer>> alist,ArrayList<Integer> curr,int target, int n){
        if(target ==0){
            alist.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<n;i++){
            if(i>index && arr[i-1] == arr[i])
                continue;
            if(arr[i]>target)
                break;
            curr.add(arr[i]);
            combination(i+1,arr,alist,curr,target - arr[i],n);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> alist = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,alist,curr,target,candidates.length);
        return alist;
    }
}