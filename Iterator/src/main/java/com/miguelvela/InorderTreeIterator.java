package com.miguelvela;

import java.util.ArrayDeque;
import java.util.Deque;

public class InorderTreeIterator implements TreeIterator {

    private Deque<TreeNode> stack;

    public InorderTreeIterator(TreeNode root) {
        this.stack = new ArrayDeque<>();
        this.pushLeftChildren(root);
    }

    private void pushLeftChildren(TreeNode node) {
        while(node != null) {
            this.stack.push(node);
            node = node.getLeft();
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
        this.pushLeftChildren(node.getRight());
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
