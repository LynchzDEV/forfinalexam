package int101.Main;

import ini101.puzzling.BoolRandor;
import ini101.puzzling.Puzzle;
import ini101.puzzling.Randor;

public class Int101h11 {
    public static void main(String[] args) {
//        testPuzzle();
//        testAverage(5);
        testRandor();
        testBoolRandor();
    }

//    private static void testPuzzle() {
//        Puzzle p = new Puzzle();
//        Puzzle q = new Puzzle();
//        System.out.println("p=" + p.getValue());
//        System.out.println("p=" + p.getValue());
//        System.out.println("q=" + q.getValue());
//        System.out.println("q=" + q.getValue());
//    }

//    private static void testAverage(int count){
//        // random <count> times and compute the average value and sout the average value
//        int i = 0;
//        double sum = 0;
//        while (i < count){
//            Puzzle p = new Puzzle();
//            sum += p.getValue();
//            i++;
//            System.out.println("Value " + i + " " + p.getValue());
//        } sum /= count;
//        System.out.println("Avg is = " + sum);
//    }

    private static void testRandor(){
        Randor r = new Randor(10,15);
        for (int i =0;i < 10;i++)
        System.out.println(r.getValue());
    }

    private static void testBoolRandor(){
        BoolRandor a = new BoolRandor(1);
        for (int i =0;i < 10;i++)
        System.out.println(a.getValue());
    }
}
