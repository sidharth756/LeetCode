class Solution {
    static void findSum(int index ,List<List<Integer>> alist ,ArrayList<Integer> curr,int[] c,int remtarget){
        if(index == c.length){        
            if(remtarget == 0){
                alist.add(new ArrayList<>(curr));
            }
            return;
        }
        if(c[index] <= remtarget){
        curr.add(c[index]);
        findSum(index,alist,curr,c,remtarget - c[index]);
        curr.remove(curr.size()-1);
        }
        findSum(index+1,alist,curr,c,remtarget);

    }
    public List<List<Integer>> combinationSum(int[] c, int target) {

        List<List<Integer>> alist  = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        findSum(0,alist,curr,c,target);
        return alist;
    }
}