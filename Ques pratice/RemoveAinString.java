// remove a specific letter in a string
public class RemoveAinString {
    public static void main(String[] args) {
        String s="adffkfeada";

       System.out.println(remove(s, 'a'));
    }
    static String remove(String s, char target){
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char e=s.charAt(i);
            if (e!=target) {
                res.append(e);
            }
        }
        return res.toString();
    }
}
