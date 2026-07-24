class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minop =Integer.MAX_VALUE;
        int curop=0;
        int count =0;
        int n = blocks.length();
        for(int i=0;i<=n-k;i++){
            curop =0;
            int kk = k;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j) == 'B'){
                    continue;
                }
                if(blocks.charAt(j) == 'W'){
                    curop++;
                }

            }
            minop= Math.min(minop,curop);
        }
        return minop;
    }
}