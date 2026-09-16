
public class HourlyEmployee extends Employee{

    private double hourlyWage;
    private double[] hoursWorked = new double[4];

    public HourlyEmployee(String firstName, String lastName, String department, double hourlyWage,double hourlyWorked){
        super(firstName, lastName, department);
        this.hourlyWage = hourlyWage; 
    }

    public double getHourlyWage(){
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage; 
    }
    public double getTotalWages(){
        return totalHours() * hourlyWage;
    }

   public double getHours(int week){
       return hoursWorked[week - 1];
   } 

   public double getTotalHours(){
       double total = 0;
       for (int i = 0; i < hoursWorked.length; i++){
           total = total + hoursWorked[i];
       }
       return total;
   }

   public double getAverageHours(){
       return totalHours() / 4.0;


    //print methods
    public void printTotalHours() {
        System.out.println("Total hours: "+ getTotalHours());
    }

    public void printAverageHours() {
        System.out.printf("Average hours per week: "+getAverageHours());
    }

    public void printTotalWages() {
        System.out.printf("Total wages: "+ getTotalWages());
    }

}
