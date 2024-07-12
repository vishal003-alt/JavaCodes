//package nandha;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("dog");
        animals.push("cat");
        animals.push("tiger");
        System.out.println("Stack before popping : "+animals);
        animals.pop();
        System.out.println("Stack after popping :"+animals);

    }
    
}
