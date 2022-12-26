package com.bridgelabz;

public class GenericSearch {
    static <T extends Comparable> int binarySearch(T[] arr, T x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l+r)/2;

            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }


    public static void main(String []args)
    {
        String[] arr = { "Soujanya", "Ashok", "Sravan", "Jaya"};
        String x = "Ashok";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);

        Integer[] arr1 = { 40, 15, 10, 20};

        int result1 = binarySearch(arr1, 100);

        if (result1 == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result1);
    }
}