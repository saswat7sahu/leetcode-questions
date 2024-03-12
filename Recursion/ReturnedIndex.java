//returned all index of a target element without adding the indexes list in argumet using recursion.

import java.util.ArrayList;
import java.util.List;

public class ReturnedIndex {
    public static void main(String[] args) {
        int a[]={1,2,3,2,2};
        System.out.println(a.length);
        System.out.println(findAllIndex(a, 2, 0));
    }
    static List findAllIndex(int arr[],int target,int index){
        List <Integer> list=new ArrayList<>();
        if (index==arr.length) {
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        List<Integer> belowIndex=findAllIndex(arr, target, index+1);
        list.addAll(belowIndex);
        return list;
    }
}
