import java.util.Scanner;
class Bill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int unit=sc.nextInt();
		int amount=0;
		if(unit<=200){
			System.out.println("Free");
		}
		else if(unit<){
			amount=amount*1.20;
			System.out.println(amount);