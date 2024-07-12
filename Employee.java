import java.util.ArrayList;
import java.util.List;
public class Employee implements Comparable{
    public String emp_id,emp_name;

    public Employee(String emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    
    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
       //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
class OrderElement
 {
    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add(123,"Vishal");
        lst.add(234,"Dharani");
        
        

    }
}
