import java.util.Scanner;
class PrimeNum{
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int i=2;
			while(i<=a){
				if(i%i==0&&i%1==0){
					System.out.println(i);}
			i++;
}
}
}