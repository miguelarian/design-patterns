package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeType oak = new TreeType("Oak", "Green", "Hardwood");
        TreeType pine = new TreeType("Pine", "Green", "Softwood");
        TreeType maple = new TreeType("Maple", "Red", "Hardwood");

        List<Tree> forest = new ArrayList<>();
        forest.add(new Tree(1, 1, oak));
        forest.add(new Tree(2, 2, pine));
        forest.add(new Tree(3, 3, maple));
        forest.add(new Tree(4, 4, oak));
        forest.add(new Tree(5, 5, pine));
        forest.add(new Tree(6, 6, maple));
        forest.add(new Tree(7, 7, oak));
        forest.add(new Tree(8, 8, pine));
        forest.add(new Tree(9, 9, maple));

        forest.forEach(Tree::draw);
    }
}