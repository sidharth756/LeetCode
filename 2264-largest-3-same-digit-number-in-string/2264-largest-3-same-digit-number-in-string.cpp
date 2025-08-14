class Solution {
public:
    string largestGoodInteger(string num) {
        string maxgood = "";
        string cur="";
        int n = num.size();
        for(int i=0;i<n-2;i++){
            
            if(num[i+1]==num[i] && num[i+2]==num[i]){
                cur = num.substr(i, 3);
                if(cur > maxgood){
                    maxgood = cur;
                }

            }
        }
        return maxgood;
    }
};