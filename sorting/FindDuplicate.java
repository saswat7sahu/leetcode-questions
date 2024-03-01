// given an array 1 to n .find the duplicate number appear int the arrary. time complexcity= o(n)
public class FindDuplicate {
    public static void main(String[] args) {
        int a[]={3,4,2,1,3};
        System.out.println(duplicateNumber(a));
    }
    static int duplicateNumber(int arr[]){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i+1!=arr[i]) {
                return arr[i];
            }
        }
        return -1;
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
