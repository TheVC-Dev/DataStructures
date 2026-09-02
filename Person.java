public class Person{

    private String firstName;
    private String lastName;
    private int id;
    private static int idCount = 1;

    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = idCount++;
    }

    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public String getfullName(){
        return firstName + " " + lastName;
    }

    public int getId(){
        return id;
    }

    public void printFirstName(){
        system.our.printin(firstName);
        
    }
    public void printLastName(){
        system.our.printin(firstName);
        
    }

    public void printid(){
        system.our.printin(id);
        
    }

    public String toString(){
        return "Name: " + getfullName() + ", ID: " + id; 
    }
}

