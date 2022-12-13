/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ifstatement;

/**
 *
 * @author kbual
 */
public class ifstatement {

    public static void main(String[] args) {
        demo01IfStatement();
        demo02IfStatement();
        demo03NestedIfStatement();
        System.out.println(exercise03(65.0));
        demo04SwitchStatement();
        demo05SwiitchStatement2();
        demo06TernaryOperator();
        demo07SwitchcaseExpression();

        // Repetitionn
        demo11WhileLoop();
//        demo12DoWhileLoop();
        demo13ForLoop();

    }

    private static void demo01IfStatement() {
        int x = 5;
        if (x > 3) {
            System.out.println("x is greater than 5");
        }

    }

    private static void demo02IfStatement() {
        int x = 5;
        if (x > 3) {
            System.out.println("x is greater than 3");
        } else {
            System.out.println("x is not greater than 3");
        }
    }

    private static void demo03NestedIfStatement() {
        int x = 0;
        if (x < 0) {
            System.out.println(x + " is less thann 0");
        } else if (x == 0) {
            System.out.println(x + " is zero");
        } else {
            System.out.println(x + " is greater than zero");
        }
    }

    private static char exercise03(double i) {
        // 80up A ,70up B ,60up C ,50up D ,otherwise F
        if (i >= 80) {
            return 'A';
        } else if (i >= 70) {
            return 'B';
        } else if (i >= 60) {
            return 'C';
        } else if (i >= 50) {
            return 'D';
        } else {
            return 'F';
        }

    }

    private static void demo04SwitchStatement() {
        int score = 4;
        switch (score) {
            case 4:
                System.out.println("A");
                break;
            case 3:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            case 1:
                System.out.println("D");
                break;
            case 0:
                System.out.println("C");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    private static void demo05SwiitchStatement2() {
        char g = 'd';
        switch (g) {
            case 'a','A' ->
                System.out.println("4");
            case 'b','B' ->
                System.out.println("3");
            case 'c','C' ->
                System.out.println("2");
            case 'd','D' ->
                System.out.println("1");
            case 'f','F' ->
                System.out.println("0");
            default ->
                System.out.println("Error");
        }

    }

    private static void demo06TernaryOperator() {
        double score = 45.6;
        String s = score >= 50.0 ? "Good" : score > 50.0 ? "Pass" : "Fail";
        System.out.println(score + " is ... " + s);
    }

    private static void demo07SwitchcaseExpression() {
        char g;
        int score = 4;
        g = switch (score) {
            case 1 ->
                'D';
            case 2 ->
                'C';
            case 3 ->
                'B';
            case 4 ->
                'A';
            default ->
                'x';
        };
        System.out.println("g = " + g);
    }

    private static void demo11WhileLoop() {
        int x = 1;
        int s = 0;
        while (x < 10) {
            ++x;
            s += x;
        }
        System.out.println("s,x = " + s + ", " + x);
    }

    /* private static void demo12DoWhileLoop(){
        int x = 1;
        int s = 0;
        do {
          x++;
          if(x==5) continue;
          s += x;
        }
    }*/
    private static void demo13ForLoop() {
        int s = 0;
        for (int x = 0; x < 10; ++x) {
            if (x == 5) {
                continue;
            }
            if (x % 9 == 0) {
                break;
            }
            s += x;
        }
        System.out.println("s=" + s);
    }

}
