//given an array of integer.find smallest positive number in an array .time complexcity is o(n)
public class FindSmallestPositiveNumer {
    public static void main(String[] args) {
        int num[]={3,4,-1,1};
        System.out.println(smallestPositiveNum(num));
    }
    static int smallestPositiveNum(int a[]){
        sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i+1!= a[i]) {
                return i+1;
                
            }
        }
        return a.length;
    }
    static void sort(int arr[]){

        int i=0;
      while (i<arr.length) {
        if ( arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[arr[i]-1]) {
            swap(arr, i, arr[i]-1);
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
