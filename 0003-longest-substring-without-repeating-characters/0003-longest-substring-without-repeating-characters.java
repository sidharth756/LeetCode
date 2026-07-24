class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        HashSet<Character> charSet = new HashSet<>();
        int left =0;
        for(int right =0;right<n;right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxlen =Math.max(maxlen, right - left +1);
        }
        
        return maxlen;
    }
}