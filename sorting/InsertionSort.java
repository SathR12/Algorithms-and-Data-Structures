public class InsertionSort {
    public static void main(String[] args) {
        int[] sort_arr = {4, 1, 25, 0, 123, 0, 4};
        System.out.println("Insertion sort: " + output(insertionSort(sort_arr)));
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > key) {
                arr[prev + 1] = arr[prev];
                prev -= 1;
            }
            arr[prev + 1] = key;
        }
        return arr;

    }

}
