import java.util.Scanner;
class Salary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary amount : ");
		int Total_Salary=sc.nextInt();
		System.out.println("Enter the hike percentange :");
		int Perfomance=sc.nextInt();
		int hike=Total_Salary/100;
		int result=(hike*30)+Total_Salary;
		int sal=result*12;
			if(Perfomance>=80){
				System.out.println(result);
			}
else if(Perfomance<80){
int hikeless=(Perfomance/80.0)*hike;
System.out.println(sal*hikeless);
}
}
}

		
				
				
				
		