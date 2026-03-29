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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        // If trees match from this node
        if (isSameTree(root, subRoot)) return true;

        // Otherwise search left and right
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.val != b.val) return false;

        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }
}
