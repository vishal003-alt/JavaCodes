import java.util.Scanner;
import java.util.Stack;

import
public class InfixToPostfix {
        static int prioority(char c){
            int n=0;
            switch(c){
                case '$':
                case '^':
                n=4;
                break;
                case '*':
                case '/':
                n=3;
                break;
                case '+':
                case '-':
                n=2;
                break;
                case '=':
                n=1;
                break;
                default:
                n=0;
                break;


            }
            return n;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Character> postfix=new Stack<>();
            String s=sc.nextLine();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isAlphabetic(c)||Character.isDigit(c)){
                    System.out.println(c+" ");
                }
                else if(!Character.isAlphabetic(c)&&!Character.isDigit(c)){
                    if(c=='('){
                        postfix.push(c);
                    else if(c==')'){
                        postfix.push(c);
                    }
                    }
                }
            }
            
        }
    }
}
