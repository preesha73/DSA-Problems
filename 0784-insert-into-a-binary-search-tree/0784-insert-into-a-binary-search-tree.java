class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // 1. Base Case: If the tree is empty (root is null), create a new node.
        if (root == null) {
            return new TreeNode(val); // New family, create the first member! \U0001f476
        }

        // 2. If the new value is less than the current node's value,
        //    insert it into the LEFT subtree.
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val); // Recursively insert on the left ⬅️
        }
        // 3. If the new value is greater than the current node's value,
        //    insert it into the RIGHT subtree.
        else if (val > root.val) {
            root.right = insertIntoBST(root.right, val); // Recursively insert on the right ➡️
        }
        // 4. Return the (possibly modified) root of the tree.
        return root; // The tree has been updated, so return the root. \U0001f333
    }
}