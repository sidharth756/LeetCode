class Solution {
    public:
        int removeDuplicates(vector<int>& nums) {
            int j,size,k;
            size = nums.size();
            for(int i=0;i<size-1;i++)
            {
                for(j=i+1 ; j<size;j++)
                {
                    if(nums[i] == nums[j])
                    {
                        for(k = j ; k<size -1;k++)
                        {
                            nums[k] = nums[k+1];
                        }
                        size--;
                        j--;
                    }
                }
            }
            return size;

        }
};  
    