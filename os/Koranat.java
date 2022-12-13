package simpleos.koranat;

import Method.*;

public class Koranat {

    public static void main(String[] args) {
        testOS();
    }

    public static void testOS() {
        OS ios = new OS(1, "what", 10);
        Application app1 = new Application(1, "app1", "nothing", 1);
        Application app2 = new Application(2, "app2", "nothing", 2);
        Application app3 = new Application(3, "app3", "nothing", 3);

        ios.addApplication(app1);
        ios.addApplication(app2);
        ios.addApplication(app3);

        System.out.println(ios.toString());
        System.out.println("length of array: " + ios.getLength());
        System.out.println("storage size: " + ios.getStorageSize());
        System.out.println("used storage: " + ios.getUsedStorage());
        ios.removeApplicationRand();
        
//        ios.removeApplication(2);
        System.out.println(ios.toString());
//        System.out.println("length of array: " + ios.getLength());
//        System.out.println("storage size: " + ios.getStorageSize());
//        System.out.println("used storage: " + ios.getUsedStorage());
    }

}
