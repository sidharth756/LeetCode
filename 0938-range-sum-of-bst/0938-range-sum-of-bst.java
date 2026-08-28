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
    static void inorder(TreeNode temp,int low,int high,ArrayList<Integer> alist,int sum){
        if(temp != null){
            inorder(temp.left,low,high,alist,sum);
            if(temp.val >= low && temp.val <= high){
                alist.add(temp.val);
            }
            inorder(temp.right,low,high,alist,sum);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> alist = new ArrayList<>();
        int sum = 0;
        inorder(root,low,high,alist,sum);
        for(int a : alist){
            sum = sum + a;
        }
        return sum;
    }
}