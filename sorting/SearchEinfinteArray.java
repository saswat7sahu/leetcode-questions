public class SearchEinfinteArray {
    public static void main(String[] args) {
        int m[]={1,3,5,6,7,8,22,45,46,78,99,333,444,555,666,7778,8888888,444444444};
        
        System.out.println(searchRange(m, 444));
    }
    static int  searchRange(int a[],int target){
        int s=0,e=1;
        while(a[e]<target){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return search(a, target,s,e);
    }
    static int search(int[] a, int target,int s,int e) {
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
