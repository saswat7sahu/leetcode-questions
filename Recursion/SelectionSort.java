public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,1,32,4,3,2};
        sort(arr, 4, 0, 0);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void sort(int a[],int i,int j,int maxIndex){
        if (i==0) {
            return;
        }
        if (i>j) {
            if (a[j]>a[maxIndex]) {
                sort(a, i, j+1, j);
            }else{
                sort(a, i, j+1, maxIndex);
            }
        }else{
            int temp=a[maxIndex];
            a[maxIndex]=a[i-1];
            a[i-1]=temp;
            sort(a, i-1, 0, 0);
        }
    }
}
