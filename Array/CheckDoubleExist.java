/*Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j] */
public class CheckDoubleExist {
    public static void main(String[] args) {
        int a[]={1,2,3,2,3,9};
        System.out.println(checkIfExist(a));
    }
    static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
