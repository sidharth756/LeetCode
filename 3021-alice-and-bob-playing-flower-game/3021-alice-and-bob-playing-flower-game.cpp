class Solution {
public:
    long long flowerGame(int n, int m) {
       long long count = 0;
       int on = (n+1)/2;
        int em = m/2;
        count = count +(1LL * on * em);
        int en = n/2;
        int om = (m+1)/2;
        count = count + (1LL * en * om);
        return count;
    }    
};