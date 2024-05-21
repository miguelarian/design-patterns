package com.miguelvela;

public class Main {
    public static void main(String[] args) {
        Animal originalSheep = new Sheep("Original Sheep");
        Animal dolly = originalSheep.makeCopy();
        System.out.println("Original: " + originalSheep);
        System.out.println("Dolly: " + dolly);
    }
}