public class PrintNumAsc {
    public static void main(String[] args) {
        printNumAsc(5);
    }
    static void printNumAsc(int n){
        if (n>0) {
            printNumAsc(n-1);
            System.out.println(n);
        }
       
    }
}
