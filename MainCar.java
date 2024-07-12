class Vechicle{
    void drive(){
        System.out.println("Vechicle");
    }
}
class Car extends Vechicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class MainCar{
    public static void main(String[] args){
        Vechicle v= new Car();
        v.drive();
    }

}