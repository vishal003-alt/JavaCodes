import java.util.Scanner;
class Check{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int value=sc.nextInt();
		if(value/3==0&&value/5!=0){
			System.out.println("Hii");
		}
		if(value/5==0&&value/3!=0){
			System.out.println("Hello");
		}
		if(value/3==0&&value==5){
			System.out.println("yes");
		}
		if(value/3!=0&&value/5!=0){
		System.out.println("Quiet");
}
}
}
