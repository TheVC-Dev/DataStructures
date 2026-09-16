public abstract class Employee extends Person{

    private String department;

    public Employee(String firstName, String lastName, String department){
        super(firstName, lastName);
        this.department = department;
    }

    public String getDepartment(){
        return department; 
    }
    
    public void setDepartment(String department){
        this.department = department;
    }

}
    
