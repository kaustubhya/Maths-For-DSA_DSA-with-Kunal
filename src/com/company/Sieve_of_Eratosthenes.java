package com.company;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
//        making a new array from 0 to n+1 i.e. 40 as n here is 39
        System.out.println(primes[0]);
//        initially the prime no. spot is false, see output

        sieve(n, primes);
    }

//    Here if we get a false in an array, it means that the number is prime
    static void sieve(int n, boolean[] primes){
        for (int i = 2; i*i <= n; i++){
            if(!primes[i]){
//                !primes[i] means primes[i] = false
                for(int j = i * 2; j <= n; j += i){
//                    Here we're converting the multiples of a prime no. to true from false,
//                    so that if we land on it, we can skip it the next time
//                    Also we are doing j = j+i because the process of getting multiples goes like this:-
                   /* 2 + 2 + 2+ 2+2
                    3+3+3+3+3+3.... */
                    primes[j] = true;
                }
            }
        }
//        to bring out all multiple outputs at once
        for (int i = 2; i <= n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
//                printing out all the prime nos. we are getting till 'n'
            }
        }
    }
}
