class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> hmp = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            hmp.put(s.charAt(i) , hmp.getOrDefault(s.charAt(i),0)+ 1); 
        }
        int freq = hmp.get(s.charAt(0));
        for(int a : hmp.values()){
            if(freq != a){
                return false;
            }
        }
        return true;
    }
}