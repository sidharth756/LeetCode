class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> nums1;
        int n = nums.size();
        int a;
        for(int i =0;i<n;i++)
        {
            a = nums[i] * nums[i];
            nums1.push_back(a);
            
        }
        stable_sort(nums1.begin(), nums1.end());
        return nums1;

    }
};