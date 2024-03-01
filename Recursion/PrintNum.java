public class PrintNum {
    public static void main(String[] args) {
        printnum(10);
    }
    static void printnum(int n){
       System.out.println(n);
       if (n==1) {
        return;
       }
       printnum(n-1);
    }
}