class Solution {
public:
    bool isPowerOfFour(int n) {
        if(n>0){
            if(1073741824%n==0&&n%3==1){
                return true;
            }
        }
        return false;
    }
};