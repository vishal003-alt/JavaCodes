import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("A is greatest num");
        }
        else if(b>a&&b>c){
            System.out.println("Bi is greatest num");
        }
        else{
            System.out.println("c is greatest num");
        }
    }
}
