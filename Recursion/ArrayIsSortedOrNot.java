public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[]={3,4,5,67,1};
        System.out.println(sortredOrNot(0, arr));
    }
    static boolean sortredOrNot(int index,int a[]){
        if (index==a.length-1) {
            return true;
        }
        return a[index]<a[index+1] && sortredOrNot(index+1, a);
    }
}
