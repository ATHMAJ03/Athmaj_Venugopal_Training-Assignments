package javaDemo.mul;

import java.util.*;

public class secondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        Arrays.sort(arr);

        
        int secondSmallest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }

   
        int secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondSmallest == -1)
            System.out.println("No second smallest element");
        else
            System.out.println("Second Smallest: " + secondSmallest);

        if (secondLargest == -1)
            System.out.println("No second largest element");
        else
            System.out.println("Second Largest: " + secondLargest);
    }
}
