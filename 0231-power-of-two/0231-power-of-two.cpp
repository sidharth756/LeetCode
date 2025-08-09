class Solution {
public:
    bool isPowerOfTwo(int n) {
        long long a = n;
        if(a!=0 && ((a-1)& a) == 0){
            return true;
        }
        else 
            return false;
        
    }
}; 