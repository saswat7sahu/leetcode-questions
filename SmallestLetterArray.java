//find te smallest letter gretter than the target letter
public class SmallestLetterArray {
    public static void main(String[] args) {
        char letters[] ={'a','c','e','f','g'};
        System.out.println(find_samllest_letter(letters, 'g'));
    }
    static char find_samllest_letter(char[] l, char target) {
        
        int s = 0, e = l.length-1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                 if (l[mid] > target) {
                    e=mid-1;
                } else {
                    s = mid + 1;
                }
            }
        
        return l[s%l.length];
    }
}
