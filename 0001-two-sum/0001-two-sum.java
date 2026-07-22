class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();

    int n = nums.length;
    for(int i=0;i<n;i++){
        int numb = target - nums[i];
        if(mp.containsKey(numb) && mp.get(numb) != i ){
            return new int[] {mp.get(numb),i};
        }

        mp.put(nums[i],i);
    }
    return new int[] {};
    }
}