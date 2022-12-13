package com.mycompany.int101h12;
import int101.array.*;
import java.util.Arrays;

public class Int101h12 {

    public static void main(String[] args) {    
        studenttest();
    }
    
    
    public static void studenttest(){
        int[] s = new int[10];
        for(int i = 0; i <= 10; i++){
            student p = new student(String.format("name Student : %d",i));
            s[i] = p.getId();
            System.out.println(p + Arrays.toString(s));
        }   
    }
}


