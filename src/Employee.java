public class Employee {
    static String name, job;
    static int salary;

    public Employee(String Name, String Job, int Salary){
        name = Name;
        job = Job;
        salary = Salary;
    }


    public Employee(){
        name = "Pete";
        job = "Janitor";
        salary = 50000;
    }

    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        return name;
    }
    public void setJob(String Job){
        job = Job;
    }
    public String getJob(){
        return job;
    }
    public void setSalary(int Salary){
        salary = Salary;
    }
    public int getSalary(){
        return salary;
    }

    public String currentlyDoing(){
        if(job.equals("Janitor")){
            return(name + " is currently cleaning the bathrooms.");
        } else if(salary >= 1000000){
            return(name + " is currently just chilling.");
        } else {
            return(name + " is currently caring for the animals.");
        }
    }

    static public void printProfile() {
        System.out.println();
        System.out.println(name);
        System.out.println("Occupation: " + job);
        System.out.println("Salary: $" + salary);
    }

    public void printCondition(){
        System.out.println();
        System.out.println(name);
        System.out.println("Currently Doing: " + currentlyDoing());
    }

}

