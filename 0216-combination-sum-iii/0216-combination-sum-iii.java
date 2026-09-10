class Solution {
    static void combination(int start ,ArrayList<Integer> curr,List<List<Integer>> alist,int k, int n){
        if(k==0 && n==0 ){
            alist.add(new ArrayList<>(curr));
            return;
        }
        if(k< 0 || n < 0)
            return;
        for(int i=start;i<=9;i++){
            curr.add(i);
            combination(i+1,curr,alist,k-1,n-i);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> curr = new ArrayList<>();
        List<List<Integer>> alist = new ArrayList<>();
        combination(1,curr,alist,k,n);
        return alist;
    }
}