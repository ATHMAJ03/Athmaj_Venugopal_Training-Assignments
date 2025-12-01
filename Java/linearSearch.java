package javaDemo.mul;

import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int[] arr = new int[n]; 

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
            System.out.print(arr[i] + " ");
        }
      /*  
        int search =sc.nextInt();
        for(int i =0;i<n;i++)
        {
        	if(arr[i]==search) {
        		System.out.print(i+1);
        	}
        		
        }
        sc.close();
        */
        
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element " + key + " found at index: " + (i+1));
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element " + key + " not found in the array");
        }

        sc.close();
        
    
	}

}
