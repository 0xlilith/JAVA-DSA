public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {10, 92, 38, 74, 65};
        System.out.println("Max: " + maxValue(arr));
    }

    private static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i : arr ) {
            if (i+1 > max) {
                max = i+1;
            }
        }
        return max;
    }
}
