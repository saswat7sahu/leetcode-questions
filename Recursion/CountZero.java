public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(10000010, 0));
    }
    static int countZero(int num,int count){
        int d=num%10;
        if (num==0) {
            return count; 
        }else if (d==0) {
            return countZero(num/10, count+1);
        }else{
            return countZero(num/10, count);
        }
    }
    
}
