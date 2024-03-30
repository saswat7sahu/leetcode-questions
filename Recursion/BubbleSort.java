public class BubbleSort {
    public static void main(String[] args) {
        int a[]={3,2,4,1};
        swap(a, a.length-1, 0);
        for (int i : a) {
            System.out.println(i);
        }
    }
    static void printS(int arr[],int i , int j){
        if (i==0) {
            return;
        }
        if (i>j) {
            if (arr[j]>arr[j+1]) {
                swap(arr, j, j+1);
            }
            printS(arr,i, j+1);

        }
        else{
            printS(arr,i-1, 0);
        }
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
