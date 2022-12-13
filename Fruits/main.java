package com.mycompany.test008fckingshit;

import method.Fruit;
import method.FruitCollection;

public class Test008fckingshit {

    public static void main(String[] args) {
        testFruit();
        testFruitCollection();
        testAddFruit();
        testGetFruitAt();
        testIsFull();
        testExpand();
        testSearchForFruitName();
    }

    public static void testFruit() {
        Fruit f1 = new Fruit("gay", 0.7, 208);
        Fruit f2 = new Fruit("gay", 0.7, 208);

        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f1));

        System.out.println(f1.compareTo(f2));
        System.out.println(f2.compareTo(f1));
    }

    private static void testFruitCollection() {
//        Fruit f1 = new Fruit("gay", 0.7, 208);
//        Fruit f2 = new Fruit("gay1", 0.8, 208);

        FruitCollection collection = new FruitCollection(4);
        System.out.println(collection);
    }

    private static void testAddFruit() {
        FruitCollection collection = new FruitCollection(4);
        collection.addFruit("Pussy", 0, 0);
        collection.addFruit("Pooh", 0, 0);
        System.out.println(collection);
    }
    
    private static void testGetFruitAt() {
        FruitCollection collection = new FruitCollection(4);
        collection.addFruit("Pussy", 0, 0);
        collection.addFruit("Pooh", 0, 0);
        System.out.println(collection.getFruitAt(1));
    }
    
    private static void testIsFull() {
        FruitCollection collection = new FruitCollection(2);
        collection.addFruit("Pussy", 0, 0);
        collection.addFruit("Pooh", 0, 0);
        System.out.println(collection.isFull());
    }
    
    private static void testExpand() {
        FruitCollection collection = new FruitCollection(2);
        collection.addFruit("Pussy", 0, 0);
        collection.addFruit("Pooh", 0, 0);
        System.out.println(collection.expand(1));
        System.out.println(collection.isFull());
    }

    
    private static void testSearchForFruitName() {
        FruitCollection collection = new FruitCollection(4);
        collection.addFruit("Pussy", 0, 0);
        collection.addFruit("Pooh", 0, 0);
        collection.addFruit("Kuy", 0, 0);
        collection.addFruit("Tad", 0, 0);
        System.out.println(collection);
        System.out.println(collection.searchForFruitName("Kuy"));
    }
}
