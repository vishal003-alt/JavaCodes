import java.util.Scanner;
class Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        while(num1<=num2){
            if(num1%3==0){
                System.out.println("hii");
            }
            else if(num1%5==0){
                System.out.println("Hello");
            }
            else{
                System.out.println(num1);
            }
            num1++;
        }

    }
}