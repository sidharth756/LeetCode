class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        int n = dimensions.size();
        double maxd = 0.00;
        int maxarea =0,l=0,b=0;
        int flag =0;
        double temp =0;
        for(int i=0;i<n;i++){
            l = dimensions[i][0];
            b = dimensions[i][1];
            temp = sqrt((l * l) + (b * b));
            if(temp > maxd){
                maxarea = l*b;
                maxd = temp;
                flag = i;
            }
            else if(temp == maxd){
                maxarea = max((l * b),maxarea);
                maxd = temp;
            }
        }
        return maxarea;

    }
};