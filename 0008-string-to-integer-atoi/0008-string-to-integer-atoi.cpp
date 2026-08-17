class Solution {
public:

    int myAtoi(string s) {
        if(s.empty())return 0;
         
        int i =0;
        int n = s.length();
        while(i < n && s[i] == ' ') i++;
        if(i==n)return 0;
        int sign =1;
        if(s[i]=='+') i++;
        else if(s[i] =='-'){
            sign =-1;
            i++;
        }
        long num =0;
        while(i< s.length() && isdigit(s[i])){

            num = num * 10 + (s[i]-'0');

            if(sign * num <= INT_MIN) return INT_MIN;
            if(sign * num >= INT_MAX) return INT_MAX;
            i++;
        }
        return (int) (num * sign);
    }
};