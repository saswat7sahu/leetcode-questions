public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 8, 10 };
        System.out.println(search(arr, 11));
    }

    static int search(int[] a, int target) {
        int s = 0, e = a.length - 1;
        if (a[e] < target) {
            return -1;
        } else {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (a[mid] == target) {
                    return mid;
                } else if (a[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

}
