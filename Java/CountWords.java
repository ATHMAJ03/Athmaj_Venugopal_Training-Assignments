package javaDemo.mul;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");  
        int count = words.length;

        System.out.println("Number of words: " + count);
        sc.close();
    }
}
