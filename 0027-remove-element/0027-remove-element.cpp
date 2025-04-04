class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        /*if (nums.empty()) {
            return 0;
        }
        int j =1;
        int m;
        for(int i=0;i<=nums.size()-j;i++)
        {
            if(nums[i] == val)
            { 
             //   m = nums.size() - j ;
                while(nums.size() - j >= i && nums[nums.size() - j] == val)
                {    
                    j++;
                }
                swap(nums[i],nums[nums.size()-j]);
                j++;
            }
        }
        for(int g = j-1;g>0;g--)
        {
            nums.pop_back();
        }
        int k = nums.size(); */    
    int k = 0;
    for(int i =0 ;i< nums.size();i++)
    {
        if(nums[i]!= val)
        {
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
    }
    
};