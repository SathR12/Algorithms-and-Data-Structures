public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 9, 12, 14, 16, 23, 25, 130, 200};
        int low = 0;
        int high = arr.length;
        int ele = 12;
        System.out.println("Element found at position " + linSearch(0, arr, ele));
    }

    static int linSearch(int start, int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }

        return -1;

    }

}
