
package encapsulation;

// Employee class 
public class Employee {
   private  String name;
   private String ID;
   private  double salary;

   //getters - using getters access private details
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }
//setters - using setter method set data 
    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
   
    
}
