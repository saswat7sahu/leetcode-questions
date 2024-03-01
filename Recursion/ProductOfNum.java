public class ProductOfNum {
    public static void main(String[] args) {
        System.out.println(productNum(1223413)); 
     }
     static int productNum(int n){
         if (n==0) {
             return 1;
         }
         return n%10*productNum(n/10);
     }
}
