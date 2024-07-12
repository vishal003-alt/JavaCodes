import java.util.Scanner;

class car{
    void colour(String color){
        System.out.println(color+"HII");
    }
}
class car2 extends car{
    void colour(String colour,String name){
        System.out.println(colour+name);
    }
}
class Override{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colour=sc.nextLine();
        String Name=sc.nextLine();
        car2 c= new car2();
        //c.colour(colour);
        c.colour(colour,Name);
    }
}