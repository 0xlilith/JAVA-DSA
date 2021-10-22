import java.util.Arrays;
import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        int[] arr = new int[5]; // array
        int index1, index2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.print("Enter index1 to be swapped: ");
        index1 = sc.nextInt();
        System.out.print("Enter index1 to be swapped: ");
        index2 = sc.nextInt();
        System.out.println("before swap : " + Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println("after swap  : " + Arrays.toString(arr));
        sc.close();
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
