package Test;
import robot.Droid;

public class Test {
    public static void main(String[] args) {
        Droid p = new Droid("kuy");
        Droid x = new Droid("");
        System.out.println(p);
        System.out.println(x);
        System.out.println(p.Perform_Task("Swimmimg"));
        System.out.println(p);
        System.out.println(p.Perform_Task("Swimmimg"));
        System.out.println(p);
        System.out.println(p.Perform_Task("Swimmimg"));
        System.out.println(p);
        System.out.println(p.Perform_Task("Swimmimg"));
        System.out.println(p);
        p.Charge_Battery(60);
        System.out.println(p);
    }



}
