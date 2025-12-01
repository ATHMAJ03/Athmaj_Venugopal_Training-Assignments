package javaDemo.mul;

import java.util.*;

public class SortCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] chArr = str.toCharArray(); 
        Arrays.sort(chArr); 

        System.out.println("Sorted characters: " + new String(chArr));
        
        sc.close();
    }
}

