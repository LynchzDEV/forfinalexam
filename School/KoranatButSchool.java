package simpleos.koranatbutschool;

import Method.*;
import java.util.Arrays;

public class KoranatButSchool {

    public static void main(String[] args) {
        testSchool();
    }

    public static void testStudent() {
        Student s1 = new Student("Jinnawat", "Vilaliart");
        Student s2 = new Student("Topson", "OG");
        Student s3 = new Student("N0tail", "Old G");
        System.out.println("s1's firstname: " + s1.getFirstname());
        System.out.println("s2's firstname: " + s2.getFirstname());
        System.out.println("s3's firstname: " + s3.getFirstname());
        System.out.println("s1's lastname: " + s1.getLastname());
        System.out.println("s2's lastname: " + s2.getLastname());
        System.out.println("s3's lastname: " + s3.getLastname());
        System.out.println("s1's id: " + s1.getId());
        System.out.println("s2's id: " + s2.getId());
        System.out.println("s3's id: " + s3.getId());
    }

    public static void testSchool() {
        School sc1 = new School("KMUTT", 10);
        Student s1 = new Student("Jinnawat", "Vilaliart");
        Student s2 = new Student("Topson", "OG");
        Student s3 = new Student("N0tail", "Old G");
        System.out.println("add s1: " + sc1.addStudent(s1));
        System.out.println("add s2: " + sc1.addStudent(s2));
        System.out.println("add s3: " + sc1.addStudent(s3));
        System.out.println(sc1);
        System.out.println("remove s2: " + sc1.removeStudent(0));
        System.out.println(sc1);
//        System.out.println(Arrays.toString(sc1.getAllStudent()));
//        sc1.resize(20);
//        System.out.println(sc1);
    }
}
