/* 
* * * *
* * * 
* *
*
print the above pattern using recursion.
*/
public class PatternPrint {
    public static void main(String[] args) {
        Print(4, 0);
    }
    static void Print(int r,int c){
        if (r==0) {
            return;
        }
        if (r>c) {
            System.out.print("* ");
            Print(r, c+1);
        }
        else{
            System.out.println();
            Print(r-1, 0);
        }
    }
    
}
