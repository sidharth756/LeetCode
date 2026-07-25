class Solution {
    public int maxProduct(int n) {
        int temp = n;
        int max1 =0;
       int max2=0;
        int num =0;
        while(temp>0){
            num  =(temp%10);
            if(num > max1 ){
                max2 = max1;
                max1 = num;
            }else if(max2<num) max2= num;
            temp /= 10;
        }
        return max1*max2;
    }
}