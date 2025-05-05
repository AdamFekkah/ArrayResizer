public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 1, 0},
            {1, 3, 2},
            {0, 0, 0},
            {4, 5, 6}
        };

        System.out.println("Testing isNonZeroRow:");
        System.out.println(ArrayResizer.isNonZeroRow(arr, 0)); // false
        System.out.println(ArrayResizer.isNonZeroRow(arr, 1)); // true
        System.out.println(ArrayResizer.isNonZeroRow(arr, 2)); // false
        System.out.println(ArrayResizer.isNonZeroRow(arr, 3)); // true

        System.out.println("\nTesting resize:");
        int[][] result = ArrayResizer.resize(arr);
        for (int[] row : result) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
