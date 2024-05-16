package com.miguelvela;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreorderTreeIterator implements TreeIterator {

    private Deque<TreeNode> stack;

    public PreorderTreeIterator(TreeNode root) {
        this.stack = new ArrayDeque<>();
        if(root != null) {
            this.stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override
    public TreeNode next() {
        if(this.stack.isEmpty()) {
            return null;
        }

        TreeNode node = this.stack.pop();
        if(node.getRight() != null) {
            this.stack.push(node.getRight());
        }
        if(node.getLeft() != null) {
            this.stack.push(node.getLeft());
        }

        return node;
    }

    @Override
    public TreeNode current() {
        if(this.stack.isEmpty()) {
            return null;
        }
        return this.stack.peek();
    }
}
