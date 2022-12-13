/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tool.conversion;


public class Converter {
    
    private final double ratio;
    private final String name;
    private boolean male;
    
    // constructor //empty constructor

    public boolean isMale() {
        return male;
    }
        
    public Converter(String name,double ratio){
        this.name = name;
        this.ratio = ratio;
    }
    
    public Converter(double ratio){
        this.name = "";
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "Converter{" + "ratio=" + ratio + ", name=" + name + ", male=" + male + '}';
    }

    
    
    
    public double getRatio() { return ratio; }
    public String getName() { return name; }
    
    
    
    
    public double convert(double input){
        return input * ratio;
    }
        
    public double invert(double input){
        return input / ratio;
    }
}
