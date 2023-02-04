package com.company;

public class Newton_Raphson_Method_for_SQRT {
    public static void main(String[] args){
        int n = 40;
        System.out.println(sqrt(n));

    }

    static double sqrt(double n){
        double x = n;
//        assuming x = n initially
        double root;

//        run an infinite while loop now!
        while(true){
            root = 0.5 * (x + (n/x));   // 0.5 = 1/2

            if(Math.abs(root - x) < 0.5){
                break; // ans found
            }

            x = root;  // for precission, decimal and stuff
        }
        return root;
    }
}
