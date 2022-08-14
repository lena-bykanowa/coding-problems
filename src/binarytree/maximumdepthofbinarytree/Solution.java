package binarytree.maximumdepthofbinarytree;

import binarytree.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());

        return Math.max(left, right) + 1;
    }
}
