# Iterator pattern

*"Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.)."* - [source](https://refactoring.guru/design-patterns/iterator)

This application uses a custom binary tree implementation and offers three different iterators for deep first search (DFS) traversal: inorder, preorder and postorder.

## Class diagram

![class-diagram](class-diagram.svg)

## Example

Main.java:

```java
TreeNode tree = buildDemoTree();
TreeIterator iterator = null;

iterator = new InorderTreeIterable(tree).getTreeIterator();
printTraversal(iterator, "Inorder Traversal");

iterator = new PreorderTreeIterable(tree).getTreeIterator();
printTraversal(iterator, "Preorder Traversal");

iterator = new PostorderTreeIterable(tree).getTreeIterator();
printTraversal(iterator, "Postorder Traversal");
```
Output:

```bash
[INORDER TRAVERSAL]
[C, A, D, ROOT, E, B, F]
---------------------------------
[PREORDER TRAVERSAL]
[ROOT, A, C, D, B, E, F]
---------------------------------
[POSTORDER TRAVERSAL]
[C, D, A, E, F, B, ROOT]
---------------------------------
```