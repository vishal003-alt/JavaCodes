import java.util.Scanner;
class Example{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String sub1=s1.substring(s1.length()-2);
        String sub2=s2.substring(s2.length()-2);
        if(sub1.equals(sub2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}