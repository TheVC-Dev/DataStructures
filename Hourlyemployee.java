
public class HourlyEmployee extends Employee{

    private double hoursWorked;
    private double hourlyWage;

    public HourlyEmployeee(String firstName, String lastName, String department, double hoursWorked, double hourlyWage){
        Super(firstName, lastName, department);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage; 
    }
}
