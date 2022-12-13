package koranatbutfinal;

import exam.*;
import java.util.Arrays;

public class KoranatButFinal {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Person p1 = new Person("Jinnawat", "Vilairat", 3);
        Person p2 = new Person("Cheack1", "cheak2", 7);

        Department d1 = new Department("yay");
        d1.addStaff("Jinnawat", "Vilairat", -4);
        d1.addStaff("Test1", "Test2", -6);
        d1.addStaff("Test3", "Test4", -6);
        
        System.out.println(d1.getTypeCount(-6));
        System.out.println(d1.getCode());
        System.out.println(Arrays.toString(d1.getAllCodes()));
        System.out.println(d1.getStaff(2));
        System.out.println(Arrays.toString(d1.getAllType()));
    }

}
