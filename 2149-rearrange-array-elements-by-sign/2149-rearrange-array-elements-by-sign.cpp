class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        int p=0, ne=0;
        vector<int> pos;
        vector<int> neg;
        vector<int> ans;
        for(int x : nums){  
            if(x > 0)
                pos.push_back(x);
            else
                neg.push_back(x);
            } 
        for(int j=0;j<pos.size();j++){
            ans.push_back(pos[j]);
            ans.push_back(neg[j]);
        }
        return ans;
        
    }
};