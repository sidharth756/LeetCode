class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : nums1)
            set1.add(n);
        for(int n : nums2)
            set2.add(n);
        if(set1.size() > set2.size()){
            int[] result = new int[set1.size()];
            int i=0;
            for(int n1: set1){
                if(set2.contains(n1)){
                    result[i] =n1;
                    i++;
                }
            }
            return Arrays.copyOfRange(result,0,i);
        }
       else{
            int[] result = new int[set2.size()];
            int i=0;
            for(int n2: set2){
                if(set1.contains(n2)){
                    result[i] =n2;
                    i++;
                }
            }
            return Arrays.copyOfRange(result,0,i);
        }
        
    }
}