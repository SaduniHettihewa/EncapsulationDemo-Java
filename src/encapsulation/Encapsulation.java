
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
       
        Employee ex = new Employee();
        ex.setID("E001");
        ex.setName("Kamal Gamage");
        ex.setSalary(45000);
        System.out.println("-----Employe Details-----");
        System.out.println("Name   -: "+ex.getName());
        System.out.println("EmpID  -: "+ex.getID());
        System.out.println("Salary -:Rs."+ex.getSalary());
    }
}



