import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int a[]={3,4,2,2,1,3,4};
        List DuplicateEle=AllduplicateNumber(a);
        for (int i = 0; i < DuplicateEle.size(); i++) {
            System.out.println(DuplicateEle.get(i));
        }
    }
    static List AllduplicateNumber(int arr[]){
        sort(arr);
        List<Integer> duplicateNUm= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i+1!=arr[i]) {
                duplicateNUm.add(arr[i]);
            }
        }
        return duplicateNUm;
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
