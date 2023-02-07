package com.company;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factors(20);

    }
//  Both space and time complexity will be O(sqrt(n))
    static void factors(int n){
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
//                    this is to remove the factors which are same from repeating, eg 6*6 = 36
//                    so print 6 only once
                }
                else{
                    System.out.print(i + " ");
                    list2.add(n/i);
                    //            Stores in descending order [ 20, 10, 5]


                }
            }
        }
        for(int i = list2.size() - 1; i >= 0; i--){
//            Now it prints in an order from last to first so it is sorted in ascending order now!
//            [5 , 10, 20]
            System.out.print(list2.get(i) + " ");

        }
    }
}
