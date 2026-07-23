class Solution {
    public boolean canConstruct(String rn, String mg) {
         Map<Character,Integer> hmp = new HashMap<>();
        for(int i=0;i<mg.length();i++){
            hmp.put(mg.charAt(i) , hmp.getOrDefault(mg.charAt(i),0)+ 1); 
        }
        for(int i=0;i<rn.length();i++){
            if(hmp.getOrDefault(rn.charAt(i),0)>0){
                char c = rn.charAt(i);
                hmp.put(c, hmp.get(c)-1);
            }else
                return false;
            
        }
        return true;
    }
}