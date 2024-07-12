import java.util.Scanner;
class Star{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int mid=num/2;
        int l=mid,h=mid;
        for(int i=0;i<num;i++){
            int c=1;
            for(int j=0;i<num;j++){
                if(j>=l && j<=h){
                    System.out.print("# ");
                    c++;
                }else{
                    System.out.print("  ");
                }
                if(i<mid){
                    l--;
                    h++;
                }else{
                    l++;
                    h--;
                }
                System.out.println();
            }
        }
    
}
}