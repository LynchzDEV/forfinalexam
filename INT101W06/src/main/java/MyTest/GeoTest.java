/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyTest;


import tool.geometry.GeometryTool;
import tool.conversion.*;

public class GeoTest {
    public static void main(String[] args){
        testCircleArea();       
        testCirclePerimete();
        testOppositeSideOfRightTriangle();        
        testConverter();

    }

    private static void testCircleArea(){
        double r = 5.0;
        System.out.format("Area of Circle with radius = %.2f is %.2f%n", 
                r, GeometryTool.computeCircleArea(r));
    }
    
    private static void testCirclePerimete(){
    double r = 5.0;
    System.out.format("CirclePerimete = %.2f is %.2f%n", 
        r, GeometryTool.computeCirclePerimeter(r));
    }
    
    private static void testOppositeSideOfRightTriangle(){
    double a = 3.0;
    double b = 4.0;
    System.out.format("CirclePerimete = %.2f%n", 
        GeometryTool.computeOppositeSideOfRightTriangle(a,b));
    }
    private static void testConverter(){
        var inchToCm = new Converter("InchToCm", 2.54);
        var kgToPound = new Converter(2.2);
        System.out.println(inchToCm);
        System.out.println(kgToPound);
        var inch = 1.0;
        var cm = 5.08;
        System.out.format("%.2f inch = %.2f cm", inch, inchToCm.convert(inch));
        System.out.format("%.2f cm = %.2f inch%n", cm,inchToCm.invert(cm));
    }
}
