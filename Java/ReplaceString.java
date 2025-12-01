package javaDemo.mul;

import java.util.*;

public class ReplaceString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character/word to replace: ");
        String oldStr = sc.nextLine();

        System.out.print("Enter the new character/word: ");
        String newStr = sc.nextLine();

        String result = str.replace(oldStr, newStr);

        System.out.println("After replacement: " + result);
        
        sc.close();
    }
}
