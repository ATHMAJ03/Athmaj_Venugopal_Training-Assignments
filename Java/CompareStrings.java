package javaDemo.mul;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if(str1.equals(str2)) {
            System.out.println("Both strings are equal (equals method).");
        } else {
            System.out.println("Strings are NOT equal (equals method).");
        }

      
        int result = str1.compareTo(str2);
        if(result == 0) {
            System.out.println("Both strings are equal (compareTo method).");
        } else if(result > 0) {
            System.out.println("String 1 is GREATER than String 2.");
        } else {
            System.out.println("String 1 is SMALLER than String 2.");
        }

        sc.close();
    }
}

