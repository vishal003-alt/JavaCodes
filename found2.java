import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class found2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int num = sc.nextInt();
        
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        
        int arr[] = new int[num];
        List<Integer> lst = new ArrayList<>();
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                lst.add(j);
            }
        }

        if (lst.isEmpty()) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at indices: " + lst);
        }

        sc.close();
    }
}
