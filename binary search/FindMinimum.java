//find minimum in rotated sorted array with time complexity 0(log n
public class FindMinimum {

    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2};
        System.out.println(findMin(arr));

    }
  
        static int findMin(int[] nums) {
          int start=0,end=nums.length-1;
           if(nums[start]<nums[end]){
               return nums[start];
           }else{
                while(start<=end){
                int mid=(int)start+(end-start)/2;
                 if(mid<end && nums[mid]>nums[mid+1]){
                     return nums[mid+1];
                 }
                if(mid>start && nums[mid]<nums[mid-1]){
                     return nums[mid];
                 }
                if(nums[start]>=nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
           }
        return nums[start];
        }
    
}