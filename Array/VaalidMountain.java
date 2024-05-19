public class VaalidMountain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,22,3};
        VaalidMountain ob=new VaalidMountain();
        System.out.println(ob.validMountainArray(arr));
    
    }
    public boolean validMountainArray(int[] arr) {
        int l=0,r=arr.length-1;
        if(arr.length<3) return false;
        while (l<arr.length-1 && arr[l]<arr[l+1]) {
           l++;
        }
        while (r>0 && arr[r]<arr[r-1]) {
                r--;
        }
      return l==r && l>0 && r<arr.length-1;  
    }
    
}
