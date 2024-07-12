import java.util.Scanner;

public class Parking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choise: ");
        System.out.println("Enter 1 for entry ,Enter 2 for exit");
        int slot[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int choise=sc.nextInt();
        while(choise!=3){
        if(choise==1){
            System.out.println("Enter your vechicle number : ");
            int num1=sc.nextInt();
            while(true){
                System.out.println("Which slot do your prefer : ");    
                int s =sc.nextInt();

                if(slot[s]==0){
                    slot[s]=num1;
                    System.out.println("success");
                    break;
                }
                else{
                    System.out.println("No entry");
                }
            }
            
        }
            else if(choise==2){
                System.out.println("Enter your vechicle num : ");
                int vechicle=sc.nextInt();
                for(int i=0;i<20;i++)
                {
                    if(slot[i]==vechicle)
                    {
                        slot[i]=0;
                        System.out.println("Vehicle Exit..");
                    }
                }
                
            }
            else{
                System.out.println("Enter the correct numbers ");
                System.out.println("Thank you");
                break;
            }
        }
    }
}       

