package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode tree = buildDemoTree();
        TreeIterator iterator = null;

        iterator = new InorderTreeIterable(tree).getTreeIterator();
        printTraversal(iterator, "Inorder Traversal");

        iterator = new PreorderTreeIterable(tree).getTreeIterator();
        printTraversal(iterator, "Preorder Traversal");

        iterator = new PostorderTreeIterable(tree).getTreeIterator();
        printTraversal(iterator, "Postorder Traversal");
    }

    private static void printTraversal(TreeIterator iterator, String traversalType) {
        List<String> nodeValues;
        System.out.println("[" + traversalType.toUpperCase() + "]");
        nodeValues = getTraversal(iterator);
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