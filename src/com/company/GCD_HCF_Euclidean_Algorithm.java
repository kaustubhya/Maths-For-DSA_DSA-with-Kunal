package com.company;

public class GCD_HCF_Euclidean_Algorithm {
    public static void main(String[] args) {
        System.out.println(gcd(04,0));

    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
