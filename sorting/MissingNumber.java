//find the missing number .given n distinct number 1 to n.
public class MissingNumber {

     public static void main(String[] args) {
        int a[]={1,0,4,2};
        System.out.println(missingElement(a));
     }
     static int missingElement(int arr[]){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr[i]) {
                return i;
            }
        }
        return arr.length;
     }
     static void sort(int arr[]){

        int i=0;
      while (i<arr.length) {
        if ( arr[i]<arr.length && arr[i]!=arr[arr[i]]) {
            swap(arr, i, arr[i]);
        }
        else{
            i++;
        }
      }
     }
     static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }