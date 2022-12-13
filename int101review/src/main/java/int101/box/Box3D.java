/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package int101.box;

/**
 *
 * @author kbual
 */
public class Box3D {
    private double width;
    private double length;
    private static double height;
    private static String color;

    public Box3D(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public static double getHeight() {
        return height;
    }

    public static String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static void setHeight(double height) {
        Box3D.height = height;
    }

    public static void setColor(String color) {
        Box3D.color = color;
    }

    @Override
    public String toString() {
        return "Box3D{" + "width=" + width + ", length=" + length + ", height="+ height + ", color=" + color + '}';
    }
    
    public double computeVolume(){
        return width * length * height;
    }
    public boolean canCover(Box3D b1){
        return this.length > b1.length && this.width > b1.width;
    
        
    }
    
}

    

