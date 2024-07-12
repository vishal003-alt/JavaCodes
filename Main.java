import java.util.Scanner;

class A{
    void disp(String a){
        System.out.println(a);
    }
}
class B extends A{
    void disp2(){
        System.out.println("Hello");
    }
}
class C extends B{
    void disp3(){
        System.out.println("Bye");
    }
}
public class Main{
    public static void main(String[] args){
        C obj=new C();
        obj.disp("vishal");
        obj.disp2();
        obj.disp3();
    }
}