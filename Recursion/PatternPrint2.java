public class PatternPrint2 {
    public static void main(String[] args) {
        Print(4, 0);
    }
    static void Print(int r,int c){
        if (r==0) {
            return;
        }
        if (r>c) {
            Print(r, c+1);
            System.out.print("* ");
        }
        else{
            Print(r-1, 0);
            System.out.println();
        }
    }
}
