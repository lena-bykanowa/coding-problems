package binarytree;
/* Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along
the longest path from the root node down to the farthest leaf node.*/

import binarytree.TreeNode;
import binarytree.maximumdepthofbinarytree.Solution;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
//        TreeNode six = new TreeNode(6, null, null);
        TreeNode five =  new TreeNode(5, null, null);
        TreeNode four = new TreeNode(4, null, null);
        TreeNode three = new TreeNode(3, null, five);
        TreeNode two = new TreeNode(2, four, null);
        TreeNode one = new TreeNode(1, two, three);

        Solution solution = new Solution();
        int maxDepth = solution.maxDepth(one);
        System.out.println(maxDepth);
    }
}
