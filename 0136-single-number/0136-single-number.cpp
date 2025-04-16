class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int s = nums.size();
        int c;
        c = nums[0];
        for(int i = 1 ; i < s;i++)
        {
            c = c ^ nums[i];
        }
        return c;
    }
};