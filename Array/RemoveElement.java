public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        System.out.println(removeE(nums, 2));
    }
    static int removeE(int arr[],int val){
        int k=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=val){
               arr[k]=arr[i];
               k++;
           }
        }
        return k;
    }
}