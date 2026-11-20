class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums11 = Arrays.copyOf(nums1,m);
        int pos =0;
        ArrayList<Integer> alist = new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(nums11[i] < nums2[j]){
                nums1[pos] = nums11[i];
                pos++;
                i++;
            }
            else if(nums2[j] < nums11[i]){
                nums1[pos] = nums2[j];
                pos++;
                j++;
            }
            else{
                nums1[pos] = nums11[i];
                pos++;
                nums1[pos] = nums2[j];
                pos++;
                i++;
                j++;
            }
        }
        while(i<m){
            nums1[pos++] = nums11[i++];
        }
        while(j<n){
            nums1[pos++] = nums2[j++];
        }
    }
}