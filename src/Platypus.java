public class Platypus extends Animal{
    String coatColor;
    boolean isWearingHat;

    public Platypus(String species, String name, boolean hungry, double weight, int age, String birthday, String coatColor, boolean isWearingHat) {
        this.species = species;
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;
    }


    public void printPlatyCondition(){
        System.out.println(name);
        System.out.println("Is hungry? " + isHungry());
        System.out.println("Coat Color: " + coatColor);
        System.out.println("Is wearing a stylish hat? " + isWearingHat);
    }




    public String checkPerry() {
        if(coatColor.equals("blue") && isWearingHat){
            return ("It's Perry the Platypus!!");
        } else {
            return ("It's just a normal platypus.");
        }
    }
}