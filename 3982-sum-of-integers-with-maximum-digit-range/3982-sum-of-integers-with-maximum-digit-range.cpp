class Solution {
public:
    int maxDigitRange(vector<int>& nums) {
        int n = nums.size();
        vector<int> arr;
        int num= 0;
        int n_max =0;
        int n_min = 0;
        int temp =0;
        long n_dif = 0;
        int d_max = INT_MIN;
        int t_min = INT_MAX;
        for(int i =0;i<n;i++){
            num = nums[i];
            n_min = INT_MAX;
            n_dif =0;
            n_max = INT_MIN;
            while(num > 0){
                temp = num % 10;
                num = num/10;
                if(temp > n_max)
                    n_max = temp;
                if(temp < n_min)
                    n_min = temp;  
                n_dif = n_max - n_min;
            }
            arr.push_back(n_dif);
            if(n_dif > d_max )
                d_max = n_dif;
        }
        long long res =0;
        for(int j =0;j<n;j++){
            if(arr[j] == d_max){
                res = res + nums[j];
            }
        }
        return res;
    }
};