import java.util.Stack;
import java.util.Scanner;
public class Post {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        String Str=sc.nextLine();
        for(int i=0;i<Str.length();i++){
            char ch=Str.charAt(i);
            if(ch>='0'&&ch<='9'){
                st.push(ch-'0');
            }
            else{
                int k=0;
                switch(ch){
                    case '+':
                        k=st.pop()+st.pop();
                        st.push(k);
                        break;
                    case '-':
                        k=st.pop()-st.pop();
                        st.push(k);
                        break;
                    case '*':
                        k=st.pop()*st.pop();
                        st.push(k);
                        break;
                    case '/':
                        k=st.pop()/st.pop();
                        st.push(k);
                        break;
                    default:
                        System.out.println("Invalid");  

                }
            }
        }System.out.println(st.pop());

    }
    
}
