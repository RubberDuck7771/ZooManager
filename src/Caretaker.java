public class Caretaker extends Employee {
    String specialtyAnimal;




    public Caretaker(String Name, String Job, int Salary, String SpecialtyAnimal){
        name = Name;
        job = Job;
        salary = Salary;
        specialtyAnimal = SpecialtyAnimal;
    }




    public String getSpecialtyAnimal() {
        return specialtyAnimal;
    }
    public void setSpecialtyAnimal(String animal){
        this.specialtyAnimal = animal;
    }




    public String feed(String animal){
        if(animal.equals(this.specialtyAnimal)){
            return(name + " fed the " + this.specialtyAnimal + ".");
        } else {
            return(name + " accidentally fed the " + animal + " the wrong food!");
        }
    }


    public void printCareData() {
        System.out.println("Species Specialization: " + specialtyAnimal);
    }

}





