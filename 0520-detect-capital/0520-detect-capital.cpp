class Solution {
public:
    bool detectCapitalUse(string word) {
        int s = word.size();
        int count=0,count1=0,first=0;
        for(int i= 0 ;i<s;i++)
        {
            if(word[0] >= 'A' && word[0] <= 'Z')
            {
                first=1;
            }
            if(word[i] >= 'A' && word[i] <= 'Z' )
            {
                count++;
            }
            if(word[i] >= 'a' && word[i] <= 'z' )
            {
                count1++;
            }
        }
        if(count == s) return true;
        if(first ==1 && count1 == s-1) return true;
        if(count1 == s) return true;    
        return false;
    }
};