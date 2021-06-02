
package encapsulation;

public class Encapsulation {

    //main class 
    public static void main(String[] args) {
       //create object for Employee class
       
        Employee ex = new Employee();
        
        //set data
        ex.setID("E001");
        ex.setName("Kamal Gamage");
        ex.setSalary(45000);
        // get data and display git 
        System.out.println("-----Employe Details-----");
        System.out.println("Name   -: "+ex.getName());
        System.out.println("EmpID  -: "+ex.getID());
        System.out.println("Salary -:Rs."+ex.getSalary());
    }
}



