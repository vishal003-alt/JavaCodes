import java.util.Scanner;
class Triangle{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int triangle=a+b+c;
				boolean res =a+b+c ==180 ? true:false;
				System.out.println(res);
}
}