public class SearchElement {
    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 6, 89 ,43,33,22,1};
        System.out.println(findElement(num, 1));
    }
    static int findElement(int a[],int target){
        int peak=searchElement(a);
        int res=search(a, target, 0, peak);
        if (res!=-1) {
            return res;
        }else{
            return search(a, target, peak+1, a.length-1);
        }
    }
    static int searchElement(int a[]){
        int s=0,e=a.length-1;
        while (s<e) {
            int mid =s+(e-s)/2;
            if (a[mid]<a[mid+1]) {
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;

    }
    static int search(int[] a, int target,int s ,int e) {
    
        boolean CheckAsc= a[s]<a[e];
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (a[mid] == target) {
                    return mid;
                } else{
                    if (CheckAsc) {
                        if (a[mid] < target) {
                            s = mid + 1;
                        } else {
                            e = mid - 1;
                        }
                    }else{
                        if (a[mid] < target) {
                            e = mid -1;
                        } else {
                            s = mid + 1;
                        }
                    }
                }
            }
        return -1;
    }

}
