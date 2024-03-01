public class CyclicSort {
public static void main(String[] args) {
   int a[]={3,4,1,2,5};
   sort(a);
   for (int i : a) {
    System.out.println(i);
   } 
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
