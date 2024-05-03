//find ceiling of a number . 
public class CeilingofNum {
    public static void main(String[] args) {
        int a[]={2,3,4,5,8,12,34,44,55,66,77};
        System.out.println(findceiling(a, 1));
    }
    static int findceiling(int arr[],int target){
        int s=0,e=arr.length-1;
        while (s<e) {
            int m = (int) s+(e-s)/2;
            if (arr[m]==target) {
                return arr[m];
            }
            if (arr[m]<target) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return arr[s];
    }
}
