/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums. */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,3,4,4};
        int i=1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j-1]!=nums[j]) {
                nums[i]=nums[j];
                i++;
            }
        }
        for (int x : nums) {
            System.out.println(x);
        }
    }
}
