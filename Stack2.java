import java.util.Stack;
import java.util.Scanner;
public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st=new Stack<>();
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        st.push(s);
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch==c){
                    //System.out.println("The element is in this stack");
                    flag=true; 
                    break; 
                    

        }
        //else{
            //System.out.println("The char is not in  that stack");
            //break;
        //}
    }if(flag){
        System.out.println("yes char appeared in that stack");
    }else{
        System.out.println("no the char not appeared in the stack");
    }

    }
    
}
