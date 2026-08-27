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
    static void preorder(TreeNode temp,List<Integer> alist){
       if(temp != null){
        alist.add(temp.val);
        preorder(temp.left,alist);
        preorder(temp.right,alist);
       }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> alist = new ArrayList<>();
        preorder(root,alist);
        return alist;
    }
}