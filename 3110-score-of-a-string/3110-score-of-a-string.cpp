class Solution {
public:
    int scoreOfString(string s) {
        int res=0;
        for(int j=1;j<s.size();j++)
        {
            res=res+abs(s[j]-s[j-1]);
        }
        return res;
    }
};