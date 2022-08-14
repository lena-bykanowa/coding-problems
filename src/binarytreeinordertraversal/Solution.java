package binarytreeinordertraversal;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static final List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root.getLeft() != null) {
            inorderTraversal(root.getLeft());
        }
        result.add(root.getVal());
        if (root.getRight() != null) {
            inorderTraversal(root.getRight());
        }
        return result;
    }
}
