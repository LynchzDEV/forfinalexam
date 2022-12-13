/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review.int101;

/**
 *
 * @author kbual
 */
public class ReviewStatic {
    public static double computeSphereVolume(double radius){
        double result;
        result = 4 * Math.PI * Math.pow(radius, 3) / 3;
        return result;
    }
    public static double computeBoxVolume(double width,double height,double depth){
        double result;
        result = width * height * depth;
        return result;
    }
    public static double findMax(double v1,double v2,double v3){
        double result;
        if(v1 > v2 && v1 > v3){
            result = v1;
        }else if(v2 > v1 && v2 > v3){
            result = v2;
        }else {
            result = v3;    
            }
        return result;
    }
    public static double positiveSum(double v1,double v2,double v3,double v4){
        double result = 0;
        if(v1 > 5){
            result += v1;
        }if(v2 > 5){
            result += v2;
        }if(v3 > 5){
            result += v3;
        }if(v4 > 5){
            result += v4;
        }
        return result;
    }
    public static double product(double v1,double v2,int step){
        int result = 1;
        for(double i=v1;result<v2;i += step){
            result *= i;
        }
        return result;
    }
}

