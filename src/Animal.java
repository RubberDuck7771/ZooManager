public class Animal {
    //what information an animal needs
    static String species;
    static String name;
    boolean hungry;
    static double weight;
    static int age;
    static String birthday;


    //question: do you need to fill in all instance variables for a class to work? can you only fill one?


    public Animal(String species, String name, boolean hungry, double weight, int age, String birthday) {
        this.species = species;
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
    }


    public Animal() { //class question: how can I bte as lazy as possible right now
        this.species = "giraffe";
        this.name = "geoffrey";
        this.hungry = true; //maybe this leads to future gameification?
        this.weight = 360.77;
        this.age = 12;
        this.birthday = "11/11/11"; //because it is a string, can be formatted in any way
    }


    //if you wanted to research an animal, what would you want to be able to look up?


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public String getSpecies() {
        return species;
    }


    //added after the fact - why isHungry instead of getHungry? (quick note about naming conventions)
    public boolean isHungry() {
        return hungry;
    }


    static public void printProfile() {
        System.out.println();
        System.out.println(name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Birthday: " + birthday);
    }

    public void printCondition(){
        System.out.println(name);
        System.out.println("Is hungry? " + isHungry());
    }

    //what are aspects of this animal that should/could be changeable?
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }


    public void makeNoise() {
        if (hungry) {
            System.out.println("*stomach growls*");
        } else {
            System.out.println("*snores*");
        }
    }
}