/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void search(TreeNode temp,int k ,int count,ArrayList<Integer> alist,int ans){
        
        if(temp!=null){
            search(temp.left,k,count++,alist,ans);
            alist.add(temp.val);
            search(temp.right,k,count++,alist,ans);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> alist = new ArrayList<>();
        int num =0;
        search(root,k,0,alist,0);
        return alist.get(k-1);
    }
}