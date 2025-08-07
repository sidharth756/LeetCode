class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
       int n = words.size();
       vector<int> arr;
       int s,k=-1;
       string str;
       for(int i =0;i<n;i++){
         str = words[i];
         s = str.size();
            for(int j=0;j<s;j++){
                if(str[j] == x){
                    arr.push_back(i);
                    break;
                }
            }
       }
    return arr;
    }
    
};