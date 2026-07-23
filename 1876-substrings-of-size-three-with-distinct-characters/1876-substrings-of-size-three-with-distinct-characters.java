class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character,Integer> hmp = new HashMap<>();
        int n = s.length();
        if(n<3) return 0;
        int count =0;
        for(int i=0;i<3;i++){
            hmp.put(s.charAt(i),hmp.getOrDefault(s.charAt(i),0)+1);
        }
        if(hmp.size() == 3) count++;
        
        for(int i=3;i<n;i++){
            char out = s.charAt(i-3);
            char in = s.charAt(i);

            hmp.put(out,hmp.get(out)-1);
            if(hmp.get(out)==0)hmp.remove(out);

            hmp.put(in,hmp.getOrDefault(in,0)+1);
            if(hmp.size() == 3)count++;
        }
        return count;

    }
}