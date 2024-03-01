//search the peak index in  an mountain array
public class PeakIndex {
    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 6, 89 ,43,33,22,1};
        System.out.println(searchElement(num));
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
}
