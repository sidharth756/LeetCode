class Solution {
public:
    int strStr(string haystack, string needle) {
        int i=0,j=0,s1,s2,order = 0;
        s1 = haystack.size();
        s2 = needle.size();
        for(int i =0;i < s1;i++)
        {
            if(haystack[i] == needle[j])
            {
                j++;
                order++;
            }
            else
            {
                i = i-order;
                j=order=0;
            }
            if(order == s2)
            {
                return (i-s2)+1;
            }
        }
        return -1;
    }
};