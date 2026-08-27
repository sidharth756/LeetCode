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
    static void inorder(TreeNode temp,List<Integer> alist){
        if(temp!=null){
            inorder(temp.left,alist);
            alist.add(temp.val);
            inorder(temp.right,alist);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> alist = new ArrayList<>();
        inorder(root,alist);
        return alist;
    }
}