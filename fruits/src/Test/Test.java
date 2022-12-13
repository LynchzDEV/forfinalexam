package Test;

import fruit.*;

public class Test {
    public static void main(String[] args) {
//        Testfruitconstructor();

//        fruit a = new fruit("Apple", 150.9, 10);
//        fruit b = new fruit("Banana", 48.52, 6);
//        System.out.println(a);
//        System.out.println(a.equals(b));
//        System.out.println(a.compareTo(b));

        FruitCollection fc = new FruitCollection(3);
        fc.addFruit("Cherry", 85.179, 8);

        fc.addFruit("Date", 94.62, 9);
        fc.addFruit("Date", 95.92, 10);
        fc.expand(1);
        fc.addFruit("Kiwi", 64.93, 7);
        System.out.println(fc.searchForFruitName("Date"));
        System.out.println(fc.getFruitAt(0));
        System.out.println(fc.getFruitAt(1));
        System.out.println(fc.getFruitAt(2));
        System.out.println(fc.getFruitAt(3));
    }


    public static void Testfruitconstructor(){
        fruit b1 = new fruit("banana",100,8);
        fruit b2 = new fruit("banana",50,5);
        System.out.println("fruit constructor b1 : " + b1);
        System.out.println("fruit constructor b2 : " + b2);
        fruit b3 = new fruit("",-10,-2);
        System.out.println("fruit constructor(name=null,price=-10,quality=-2) b3 :" + b3);
    }

}
