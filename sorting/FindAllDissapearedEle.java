import java.util.ArrayList;
import java.util.List;

public class FindAllDissapearedEle {
    public static void main(String[] args) {
        int a[]={3,3,2,3,6,1,7,9,8};
        List m=missingElement(a);
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        }
    }
    static List missingElement(int arr[]){
        sort(arr);
        List<Integer> s =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i+1!=arr[i]) {
                s.add(i+1);
            }
        }
        return s;
     }
    static void sort(int arr[]){
      int i=0;
      while (i<arr.length) {
        if (  arr[i]!=arr[arr[i]-1]) {
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