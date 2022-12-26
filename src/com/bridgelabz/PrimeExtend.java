package com.bridgelabz;

public class PrimeExtend {

    static boolean checkPalindrome(int num){
        int reverse = 0;
        int numCopy = num;

        while(numCopy>0){
            int reminder = numCopy % 10;
            reverse = reverse*10+reminder;
            numCopy = numCopy/10;
        }

        if(reverse == num) return true;
        return  false;
    }
    static void findPrimeNumbers(){
        System.out.println("Palindromic Prime Numbers are");
        for(int i=2; i<=1000; i++){
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                if(checkPalindrome(i)){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        findPrimeNumbers();
    }
}