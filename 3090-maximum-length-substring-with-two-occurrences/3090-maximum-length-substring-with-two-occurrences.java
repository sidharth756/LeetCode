class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int maxi = 0;
        for(int i=0;i<n;i++){
            Map<Character,Integer> hmp = new HashMap<>();
            for(int j=i;j<n;j++){
                if(hmp.getOrDefault(s.charAt(j),0) == 2) 
                    break;
                hmp.put(s.charAt(j),hmp.getOrDefault(s.charAt(j),0)+1);
                int k=0;
                for(Map.Entry<Character, Integer> entry : hmp.entrySet()){
                    k++;
                    System.out.print(entry.getKey() + "" + entry.getValue());
                }

                System.out.println();
                maxi = Math.max(maxi,j-i+1);
            }
        }
        return maxi;
    }
}