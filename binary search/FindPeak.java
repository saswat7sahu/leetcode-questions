public class FindPeak {
    public static void main(String[] args) {
        int a[]={1,2,1,3,5,1,2,4};
        System.out.println(findp(a));
        
    }
    static int findp(int arr[]){
        int s=0,e=arr.length-1;
        while (s<e) {
            int mid=s +(e-s)/2;
            if (arr[mid]<arr[mid+1]) {
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
}
