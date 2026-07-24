class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        if(n == 1 && isVowel(s.charAt(0))){
            return 1;
        }
        if(n==1 && !isVowel(s.charAt(0)))
            return 0;
        int maxcount = 0;
        int count =0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        maxcount = Math.max(maxcount,count);

        for(int i =k;i<n;i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k)))count--;
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }

}