public class SelectionSort {
    public static void main(String[] args) {
        int[] sort_arr = {4, 1, 25, 0, 123, 0, 4};
        System.out.println("Selection sort: " + output(selectionSort(sort_arr)));
    }

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }


}
