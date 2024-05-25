package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tree> forest = new ArrayList<>();
        forest.add(new Tree(1, 1, "Oak", "Green", "Hardwood"));
        forest.add(new Tree(2, 2, "Pine", "Green", "Softwood"));
        forest.add(new Tree(3, 3, "Maple", "Red", "Hardwood"));
        forest.add(new Tree(4, 4, "Oak", "Green", "Hardwood"));
        forest.add(new Tree(5, 5, "Pine", "Green", "Softwood"));
        forest.add(new Tree(6, 6, "Maple", "Red", "Hardwood"));
        forest.add(new Tree(7, 7, "Oak", "Green", "Hardwood"));
        forest.add(new Tree(8, 8, "Pine", "Green", "Softwood"));
        forest.add(new Tree(9, 9, "Maple", "Red", "Hardwood"));

        forest.forEach(Tree::draw);
    }
}