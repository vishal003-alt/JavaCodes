import java.util.Scanner;
class Shape{
    void getArea(int len){
        System.out.println("Overloaded 1 :"+len*len);
    }
}
class Rectangle extends Shape{
    void getArea(int len,int brd){
       // this.len=len;
        //this.brd=brd;
        int rec=len*brd;
        System.out.println("Area of rectangle is : "+rec);
    }
}
public class Rectangles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        int brd=sc.nextInt();
        Rectangle r= new Rectangle();
        Shape s=new Rectangle();
        r.getArea(len,brd);
        s.getArea(len);
        }
}