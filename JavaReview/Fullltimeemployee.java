public class Fulltimeemployee extends Employee{

    private double salary;

    public Fulltimeemployee(String firstName, String lastName, String department, double salary){
        super(firstName, ladstName , department);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double calcTotalWages(){
        return salary * 4.0 / 52.0;
    }

    public void printTotalWages(){
        system.out.printf("Total wages: $%.2f%n", totalWages());
    }
}

