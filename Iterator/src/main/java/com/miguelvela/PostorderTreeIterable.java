package com.miguelvela;

public class PostorderTreeIterable implements TreeIterable {
        private TreeNode root;

        public PostorderTreeIterable(TreeNode root) {
            this.root = root;
        }

        @Override
        public TreeIterator getTreeIterator() {
                return new PostorderTreeIterator(this.root);
        }
}
