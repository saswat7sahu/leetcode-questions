public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,4,2,1};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int j=i+1;
            while (j>0) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
                j--;
            }
        }
    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    
}
