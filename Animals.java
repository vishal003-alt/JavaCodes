class A{
    static int add(int x){
        return x;
    }
}
class B extends A{
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
}
public class Animals {
    public static void main(String[] args) {
        int x= 2;
        int y=3;int z=6;
        B obj = new B();
        System.out.println(obj.add(x));
        System.out.println(obj.add(x,y,z));
    }
    
}