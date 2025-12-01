package javaDemo.mul;

import java.util.Scanner;

public class frequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] freq = new int[n]; // array to store frequency count
        int visited = -1;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (freq[i] == visited) continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // mark as counted
                }
            }
            freq[i] = count;
        }

        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < n; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + " → " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
