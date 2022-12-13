/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool.geometry;

/**
 *
 * @author kbual
 */
public class GeometryTool {
    public static double computeCircleArea(double radius){
            return Math.PI * radius * radius;
    }
    
    public static double computeCirclePerimeter(double radius){
            return 2 * Math.PI * radius; 
    }
    
    public static double computeOppositeSideOfRightTriangle(double a,double b){
            return Math.sqrt((a*a) + (b*b));
    }
}
// computeCirclePerimeter;
// computeOppositeSideOfRightTriangle
