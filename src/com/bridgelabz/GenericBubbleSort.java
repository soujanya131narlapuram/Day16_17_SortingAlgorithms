package com.bridgelabz;

public class GenericBubbleSort {
    static<T extends Comparable> void sort(T[] arr){
        for(int i=0; i<arr.length-1; i++){               // i=> number of iteration required
            for(int j=0; j<arr.length-i-1; j++){         // j=> for comparing elemnts
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        System.out.println("");
        System.out.println(" Sorted Array is ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] arr1 = {3,8,1,5,2,7,6};
        sort(arr1);

        String[] arr2 = {"Ashok","Soujanya", "Jaya"};
        sort(arr2);
    }
}