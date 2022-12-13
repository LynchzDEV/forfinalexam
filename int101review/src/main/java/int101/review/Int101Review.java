/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package int101.review;

/**
 *
 * @author kbual
 */
public class Int101Review {
    public static double computeSphere(double radius){
        double result;
        result = (4 * Math.PI * Math.pow(radius, 3))/3;
        return result;
    }
    public static double findMin(double v1,double v2,double v3){
        //คิดแบบใช้ Math.min
//        return Math.min(Math.min(v1,v2),v3);

        //คิด if else
        double result;
        if(v1 < v2 && v1<v3){
            result = v1;
        }else if(v2 < v3){
            result = v2;
        }else{
                result = v3;
            }
        return result;
    } 
    public static int computeProduct(int s,int i,int e){
        int result=1;
        for(double a = s; a < e;a +=i){
            if(a%2 == 1){
                result *=a; 
            }
        }
        return result;
    }
}
