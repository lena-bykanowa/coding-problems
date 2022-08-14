package binarytreeinordertraversal;

import binarytree.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode six = new TreeNode(6, null, null);
        TreeNode five =  new TreeNode(5, null, six);
        TreeNode four = new TreeNode(4, null, null);
        TreeNode three = new TreeNode(3, four, five);
        TreeNode two = new TreeNode(2, null, null);
        TreeNode one = new TreeNode(1, two, three);


        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(one);
        result.stream().forEach(System.out::println);
    }
}
