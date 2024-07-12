import java.util.Scanner;
public class HAShtah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int mid=n/2;
        int l=mid,h=mid;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=l&&j<=h){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                l--;
                h++;
            }
            else{
                l++;
                h--;
            }
            System.out.println();
        }
        }
}
