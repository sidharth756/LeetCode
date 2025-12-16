class Solution {
public:
    bool Verify(vector<int>& num){
                int n = num.size();
                for(int i =0;i<n;i++){
                    for(int j =i+1;j<n;j++){
                        if(num[i] > num[j]){
                            return false;
                        }
                    }
                } 
                return true;
            }
    bool check(vector<int>& nums) {


        
        int n = nums.size();
        for(int j =0;j<n;j++){
            int temp = nums[0];
            for(int i=0;i<n-1;i++){
                nums[i] = nums[i+1];
            }
            nums[n-1] = temp;
            bool ans = Verify(nums);
            if(ans)
                return true;
        }
        return false;
        
    
        
    }
};

