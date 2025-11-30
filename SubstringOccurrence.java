package javaDemo.mul;

import java.util.*;

public class SubstringOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); 
        }

        System.out.println("Substring '" + sub + "' occurs " + count + " times.");

        sc.close();
    }
}
