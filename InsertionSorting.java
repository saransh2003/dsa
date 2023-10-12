package Sorting;

public class InsertionSorting {
    public static void insertingSorting(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        printArray(arr);
        insertingSorting(arr);
        printArray(arr);
    }
}
