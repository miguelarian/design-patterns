package com.miguelvela;

public class InorderTreeIterable implements TreeIterable {

    private TreeNode root;

    public InorderTreeIterable(TreeNode root) {
        this.root = root;
    }

    @Override
    public TreeIterator getTreeIterator() {
            return new InorderTreeIterator(this.root);
    }
}
