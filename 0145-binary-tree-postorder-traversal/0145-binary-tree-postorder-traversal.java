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
    static void postorder(TreeNode temp,List<Integer> alist){
        if(temp != null){
            postorder(temp.left,alist);
            postorder(temp.right,alist);
            alist.add(temp.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> alist = new ArrayList<>();
        postorder(root,alist);
        return alist;
    }
}