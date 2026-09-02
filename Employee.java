public abstract class Employee extends Person{

    public static final int WEEKS = 4;

    private String department;

    public Employeee(String firstName, String lastName, String department){
        Super(firstname, lastName);
        this.department = department;
    }

    public String getDepartment(){
        return department; 
    }

    //abstract methods
    public abstract double getTotalHours();
    public abstract double getTotalWages();

    public double getAverageHoursPerWeek(){
        return getTotalHours() / WEEKS;

    }

    //print methods
    public void printTotalHours() {
        system.out.printf("Total hours: ", WEEKS,getTotalHours());
    }

    public void printAvgHoursPerWeek() {
        system.out.printf("Average hours per week: ",getAverageHoursPerWeek());
    }
}
    public void printTotalWages() {
        system.out.printf("Total wages: ", WEEKS, getTotalWages());
    }

    public void printReport() {
        System.out.print:

    }
    
