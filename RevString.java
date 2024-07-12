import java.util.Scanner;
public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int len=s.length();
        String rev="";
        char ch;
        for(int i = 0;i<len;i++){
            ch=s.charAt(i);
            rev=ch+rev;
        }
            System.out.println(rev);
        
        
    }
    
}
