class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> m;
        int n = nums.size();
        for(int i=0;i<n;i++){
            m[nums[i]]++;
        }
        int highfreq = 0,high =0;
        for(auto num : m){
            if(num.second > highfreq){
                highfreq = num.second;
                high = num.first;
            }
        }
        return high;

    }
};