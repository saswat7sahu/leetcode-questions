public class BubbleSort {
    public static void main(String[] args) {
        int e[]={34,6,7,8,3,67};
        sort(e);
       for (int i : e) {
        System.out.println(i);
       }
    }
    static void sort(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                
                if (arr[j-1]>arr[j]) {
                    SwapElement(arr, j-1, j);
                    swap=true;
                }
              
            }
            if (!swap) {
                break;
            }
        }
    }
static void SwapElement(int a[],int x,int y){
    int temp=a[x];
    a[x]=a[y];
    a[y]=temp;
}
}
