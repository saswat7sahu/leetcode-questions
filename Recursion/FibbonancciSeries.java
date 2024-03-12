
//find nth fibonacci number 
class FibbonancciSeries {
    public static void main(String[] args) {
        System.out.println(findFibbo(5));
    }
    static int findFibbo(int n){
        if (n<2) {
            return n;
        }
        return findFibbo(n-1)+findFibbo(n-2);
    }
    
}