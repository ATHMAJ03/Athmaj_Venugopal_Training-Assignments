package javaDemo.mul;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 1, 5};
        int n = arr.length;

        System.out.print("After removing duplicates: ");

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
