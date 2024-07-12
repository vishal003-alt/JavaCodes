import java.util.Scanner;

class Person{
    void firstName(String fname){
        System.out.println("First:"+fname);
    }
   void lastName(String lastname){
        System.out.println("Employee Last Name: "+lastname);
    }

}
class Employee extends Person{
    void lastName(String lastname,String Jobtitle){
        System.out.println("Last name :"+lastname+"Jobtitle : "+Jobtitle);
    }
}
class Names{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName=sc.nextLine();
        String LastNAme=sc.nextLine();
        String title=sc.nextLine();
        int emplid=sc.nextInt();
        Employee p=new Employee();
        Person e = new Person();
        e.firstName(firstName);
        p.firstName(firstName);  
        p.lastName(LastNAme);
        p.lastName(LastNAme,title);
         //p.empid(emplid);
      }
}