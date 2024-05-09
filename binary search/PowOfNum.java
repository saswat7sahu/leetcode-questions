public class PowOfNum {
    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }
    static double myPow(double x,int n){
        double value;
        if(n<0){
            n=-n;
            x=1/x;
        }
         if (n==0) {
            return 1;
        }
        if (n%2==0) {
            value=myPow(x,(int) n/2);
            return value*value;
        }else{
            value=myPow(x,(int) n/2);
            return value*value*x;
        }
    }
}
