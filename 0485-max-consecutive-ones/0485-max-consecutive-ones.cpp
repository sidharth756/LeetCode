class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0,c=0,n=0;
        n = nums.size();
        for(int i = 0 ; i<n;i++)
        {
            if(nums[i]==1)
                c++;
            else
            {
                count = max(count,c);
                c=0;
            }
        }
        return max(count,c);
    }
};