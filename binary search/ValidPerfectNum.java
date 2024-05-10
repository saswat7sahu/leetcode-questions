public class ValidPerfectNum {
    public static void main(String[] args) {
        System.out.println(isPerfectNum(1633234));
    }
    static boolean isPerfectNum(int num){
        long s=1,e=num;
        while(s<=e){
            long mid =s+(e-s)/2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid>num){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return false;
    }

}
