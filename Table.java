import java.util.Scanner;
class Table{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int num=sc.nextInt();
			int end=sc.nextInt();
			int i=1;
			while(i<=end){
				System.out.println(i+"x"+num+"="+(i*num));
				i++;
				}
		
		i=end;
		while(i>0){
				System.out.println(i+"x"+num+"="+(i*num));
				i--;

			}
	}
}