public class SortArrzparity {
    public static void main(String[] args) {
        int nums[]={1,3,4,2};
        int l=0,temp=0;
        for(int r=0;r<nums.length;r++){
            if( nums[r] % 2==0){
                temp=nums[r];
                nums[r]=nums[l];
                nums[l]=nums[r];
                l++;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
