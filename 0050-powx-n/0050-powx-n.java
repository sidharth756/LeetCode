class Solution {

    static double power(double x,long n){
        if(n==0)return 1;
        if(n<0){
            return (1.0/power(x,-n ));
        }
        if(n%2 == 0){
            return power(x*x,n/2);
        }else{
            return x* power(x,n-1);
        }
        
    }
    public double myPow(double x, int n) {
        double ans = power(x,(long)n);
        return ans;
    }
}