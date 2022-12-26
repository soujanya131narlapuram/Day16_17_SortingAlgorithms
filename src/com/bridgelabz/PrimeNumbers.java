package com.bridgelabz;

public class PrimeNumbers {

    static void findPrimeNumbers(){
        System.out.println("Prime Numbers are");
        for(int i=2; i<=1000; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println( i + " " );
            }
        }
    }
    public static void main(String[] args) {
        findPrimeNumbers();
    }
}