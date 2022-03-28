public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 9, 12, 14, 16, 23, 25, 130, 200};
        int low = 0;
        int high = arr.length;
        int ele = 12;
        System.out.println("Element found at position " + binSearch(low, high, arr, ele));

    }

    static int binSearch(int low, int high, int[] arr, int ele) {
        int mid = (low + high) / 2;
        if (arr[mid] == ele) {
            return mid;
        } else {
            if (ele < arr[mid]) {
                return binSearch(low, mid - 1, arr, ele);
            } else if (ele > arr[mid]) {
                return binSearch(mid + 1, high, arr, ele);
            }
        }

        return ele;
    }

}
