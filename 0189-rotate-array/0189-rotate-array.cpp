class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n;
        //cout<< *(nums.end() -3);
        reverse(nums.end() - k,nums.end());
        reverse(nums.begin(),nums.end()-k);
        reverse(nums.begin() ,nums.begin() + n);
        for(int i =0;i<n;i++){
            cout<<nums[i]<<",";
        }

    }
};