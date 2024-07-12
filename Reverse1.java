import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int rem;
        int b=0;
        while(a>0){
            rem=a%10;
            b=b*10+rem;
            a=a/10;

        }System.out.println(b);        }
    
}
