public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,5,76,8,9};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    static void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int maxIndex=findmaxIndex(arr,arr.length-i-1);
            swap(arr, maxIndex, arr.length-i-1);
            
           
        }
    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    
    static int findmaxIndex(int a[],int b){
        int maxIndex=0;
        for (int i = 0; i <= b; i++) {
            if (a[i]>a[maxIndex]) {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
