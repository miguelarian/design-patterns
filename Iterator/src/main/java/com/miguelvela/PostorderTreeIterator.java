package com.miguelvela;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostorderTreeIterator implements TreeIterator {

    private Deque<TreeNode> stack;

    public PostorderTreeIterator(TreeNode root) {
        this.stack = new ArrayDeque<>();
        this.fillStack(root);
    }

    private void fillStack(TreeNode node) {
        if (node == null) {
            return;
        }

        Deque<TreeNode> tempStack = new ArrayDeque<>();
        tempStack.push(node);

        while (!tempStack.isEmpty()) {
            TreeNode current = tempStack.pop();
            stack.push(current);

            if (current.getLeft() != null) {
                tempStack.push(current.getLeft());
            }
            if (current.getRight() != null) {
                tempStack.push(current.getRight());
            }
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
        return this.stack.pop();
    }

    @Override
    public TreeNode current() {
        if(this.stack.isEmpty()) {
            return null;
        }
        return this.stack.peek();
    }
}
