class Solution {
public:
    string getsortstring(int n){
        string s = to_string(n);
        sort(begin(s),end(s));
        return s;
    }
    bool reorderedPowerOf2(int n) {
        string s = getsortstring(n);
        for(int p =0;p<=29;p++){
            if(s == getsortstring(1 << p))
                return true;
        }
    return false;
    }
};