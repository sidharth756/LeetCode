class Solution {
public:
using ll = long long;
    int smallestBalancedIndex(vector<int>& nums) {
        int n = nums.size();
        if(n==1) return -1;
        ll sum = accumulate(nums.begin(),nums.end(),0ll);
        ll prod = 1;
        for(int i=n-1;i>=0;--i){
            sum = sum- nums[i];
            if(i!=n-1){
                prod  = prod * nums[i+1];
                if(prod>sum) break;
            }
            if(sum == prod) return i;
        }
        return -1;      
    }
};