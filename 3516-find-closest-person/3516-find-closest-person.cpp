class Solution {
public:
    int findClosest(int x, int y, int z) {
        int count = abs(x-z);
        int temp = abs(y-z);
        if(count== temp){
            return 0;
        }
        else if(count>temp){
            return 2;
        }
        
        return 1;
    }
};