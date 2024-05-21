public class MoveZero {
    public static void main(String[] args) {
        int nums[]={1,2,0,43,0,3};
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
