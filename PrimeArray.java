import java.util.Scanner;

class PrimeArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i =0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            System.out.print("  "+arr[i]);
        }
        System.out.println();
        for(int j=num-1;j>=0;j--){
            System.out.print("  "+arr[j]);
        }
    }
}