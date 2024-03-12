import java.util.ArrayList;
import java.util.List;

public class ReturnAllIndex {
    public static void main(String[] args) {
        int ar[]={2,3,45,6,7,32,2,2};
        List<Integer> indexes=findIndex(ar, 2, 0, new ArrayList<>());
        for (int i = 0; i < indexes.size(); i++) {
            System.out.println(indexes.get(i));
        }
    }
    static List findIndex(int a[],int target,int index,List<Integer> ans){
        if (index==a.length) {
            return ans;
        }
        if (a[index]==target) {
            ans.add(index);
        }
        return findIndex(a,target, index+1, ans);
    }
}
