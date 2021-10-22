import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.println("Original array : " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array : " + Arrays.toString(arr));
        sc.close();
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }
}
