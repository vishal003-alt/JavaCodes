import java.util.ArrayList;
import java.util.HashSet;

public class Array {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("java");
        arr.add("python");
        arr.add("c");
        arr.add("python");
        System.out.println(arr);
        HashSet<String> hs=new HashSet<>(arr);
        arr.clear();
        arr.addAll(hs);
        System.out.println(arr);
        System.out.println(hs);

    }
    
}
