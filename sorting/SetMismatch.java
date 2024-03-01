//given an array of integer 1 to n. find the number occurs twice and the number missing in array.
public class SetMismatch {
       public static void main(String[] args) {
        int a[]={};
        int num[]=findMismatchNum(a);
        for (int i : num) {
            System.out.println(i);
        }
    }
    static int[] findMismatchNum(int arr[]){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i+1!=arr[i]) {
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void sort(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            while(arr[i]!=arr[arr[i]-1]) {
                 swap(arr, i, arr[i]-1);
            }
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
