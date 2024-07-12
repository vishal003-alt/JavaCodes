class A {
    void disp(){
        System.out.println("Hii");
    }
}
class B extends A{
    void disp2(){
        System.out.println("Hello");
    }
}
class C extends A{
    void disp3(){
        System.out.println("vishal");
    }
}
public class M{
    public static void main(String[] args) {
       // A obj=new A();
        B b=new B();
        b.disp();
        C c=new C();
        b.disp2();
        c.disp3();

    }
}
