package javaDemo.mul;

public class leftRotate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = 2; // rotate by 2

        System.out.println("Before Rotation:");
        for(int x : arr) {
            System.out.print(x + " ");
        }

        // Rotate
        for(int i = 0; i < n; i++) {
            int first = arr[0]; 
            for(int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }

        System.out.println("\nAfter Left Rotation:");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
