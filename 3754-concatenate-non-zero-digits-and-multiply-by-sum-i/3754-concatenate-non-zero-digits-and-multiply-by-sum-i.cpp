class Solution {
public:
    long long sumAndMultiply(int n) {
        int temp = n;
        if(n ==0){
            return 0;
        }
        int place = 1;
        long long x=0;
        long long sum =0;
        while(temp > 0){
            int digit = temp % 10;
            if(digit !=0){
                x = digit * place + x;
                place *= 10;
            }
            temp /=10;
        }
        long long t = x;
        while (t > 0) {
            sum += (t % 10);
            t /= 10;
        }
    return x*sum;
    }
};