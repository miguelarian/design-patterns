package com.miguelvela;

public class PreorderTreeIterable implements TreeIterable {

        private TreeNode root;

        public PreorderTreeIterable(TreeNode root) {
            this.root = root;
        }

        @Override
        public TreeIterator getTreeIterator() {
                return new PreorderTreeIterator(this.root);
        }
}
