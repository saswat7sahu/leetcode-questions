//search for a range 
public class SearchforARange {
    public static void main(String[] args) {
        int a[]={1,2,3,3,3,3,4,5,9};
        int s[]=searchRange(a, 3);
        for (int i : s) {
            System.out.println(i);
        }
    }
    static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int s=0,e=nums.length-1;
        while (s<=e) {
            int mid=s+(e-s)/2;

            if (nums[mid]==target) {
                
                ans[0]=findTarget(nums, target, 0, mid-1,true);
                ans[1]=findTarget(nums, target, mid+1, e,false);
                if (ans[0]==-1) {
                    ans[0]=mid;
                }
                if (ans[1]==-1) {
                    ans[1]=mid;
                }
                break;
            }
            else if (nums[mid]<target) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    static int findTarget(int arr[],int t,int s,int e,boolean soe){
        int index=-1;
        while (s<=e) {
            int mid=s+(e-s)/2;

            if (arr[mid]==t) {
                index=mid;
               if (soe) {
                e=mid-1;
               }else{
                s=mid+1;
               }
            }
            else if (arr[mid]<t) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return index;
    }
}
