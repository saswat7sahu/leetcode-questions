public class CeilingOFNum {
    public static void main(String[] args) {
        int num[] = {2,4,5,6,89};
        System.out.println(ceilNum(num, 1));
    }
    static int ceilNum (int[] a,int target){
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
        return s;
    }
}
