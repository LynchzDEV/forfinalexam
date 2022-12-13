/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package review.test;
import int101.box.Box3D;
import int101.review.*;
/**
 *
 * @author kbual
 */
public class ReviewTest {
    public static void main(String[] args){
            testComputeSphere();
            testFindMin();
            testComputeProduct();
            testBox3D();
            

                    
    }
    
    private static void testComputeSphere(){
        System.out.println(Int101Review.computeSphere(10));
    }
    private static void testFindMin(){
        System.out.println(Int101Review.findMin(5, 5, 0));
    }
    private static void testComputeProduct(){
        System.out.println(Int101Review.computeProduct(7, 8, 20));
    }
    private static void testBox3D(){
        Box3D b1 = new Box3D(10,10);
        Box3D b2 = new Box3D(5,5);
        Box3D.setHeight(5);
        Box3D.setColor("White");
        
        System.out.println(b2.canCover(b1));
        
    }
    
}
