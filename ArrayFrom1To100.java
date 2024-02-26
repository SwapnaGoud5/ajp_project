package practice5day;

public class ArrayFrom1To100 {
    public static void main(String[] args) {
        int[] arr = new int[100]; // Create an array of size 100

        // Initialize the array with values from 1 to 100
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        // Print the elements of the array
        System.out.println("Elements of the array from 1 to 100: ");
        for (int i = 0; i < 100; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
