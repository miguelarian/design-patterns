package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode tree = buildDemoTree();
        List<String> nodeValues = null;

        System.out.println("--- Inorder Traversal -----------");
        TreeIterable inorderTreeIterable = new InorderTreeIterable(tree);
        TreeIterator inorderTreeIterator = inorderTreeIterable.getTreeIterator();
        nodeValues = getTraversal(inorderTreeIterator);
        System.out.println(nodeValues);
        System.out.println("---------------------------------");


        System.out.println("--- Preorder Traversal -----------");
        TreeIterable preorderTreeIterable = new PreorderTreeIterable(tree);
        TreeIterator preorderTreeIterator = preorderTreeIterable.getTreeIterator();
        nodeValues = getTraversal(preorderTreeIterator);
        System.out.println(nodeValues);
        System.out.println("---------------------------------");

        System.out.println("--- Postorder Traversal -----------");
        TreeIterable postorderTreeIterable = new PostorderTreeIterable(tree);
        TreeIterator postorderTreeIterator = postorderTreeIterable.getTreeIterator();
        nodeValues = getTraversal(postorderTreeIterator);
        System.out.println(nodeValues);
        System.out.println("---------------------------------");
    }

    private static List<String> getTraversal(TreeIterator iterator) {
        List<String> list = new ArrayList<>();
        while(iterator.hasNext()) {
            TreeNode node = iterator.next();
            list.add(node.getValue());
        }
        return list;
    }

    private static TreeNode buildDemoTree() {
        TreeNode tree = new TreeNode("ROOT");
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");

        tree.setLeft(a);
        tree.setRight(b);
        a.setLeft(c);
        a.setRight(d);
        b.setLeft(e);
        b.setRight(f);
        return tree;
    }
}