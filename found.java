import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class found {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        int target=sc.nextInt();
        int arr[] = new int[num];
       
       
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

            List<Integer> lst= new ArrayList<>();
            for(int j=0;j<arr.length;j++){
            if(arr[j]==target){
                lst.add(j);
            }
        }
        if(lst.isEmpty()){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
    }
        
    }
