package com.company;

public class Square_Root {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f", sqrt(n,p));
//        Limiting the answer to 3 places after decimal, even if digits repeat
//        %.3f is a placeholder
    }

//  Time Complexity: O(log(n))
    static double sqrt(int n, int p){
        int start = 0;
        int end = n;

        double root = 0.0;
        while (start <= end){
            int mid = start +  (end - start)/2;

            if (mid * mid == n){
                return mid;
            }

            if(mid * mid < n){
                end = mid - 1;
            }

            if(mid * mid > n){
                start = mid + 1;
            }

//            Using Binary Search Here
        }

//        Now we do loop running for getting decimal and accuracy
        double increment = 0.1;

        for (int i = 0; i < p; i++){
            while(root * root <= n){
                root = root + increment;
//                add decimals to the root if it is found and within the range
            }

            root = root - increment;
//            here say root was 6.32 and we've reached 6.1, 6.2, 6.3, 6.4, so once it reaches 6.4,
//            we'll go back to 6.3 and start from 6.31, 6.32......
            increment = increment / 10;

        }

        return root;

    }
}
