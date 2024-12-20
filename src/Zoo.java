import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        //construct animals
        Animal Oscar = new Animal("Ostrich", "Oscar", true, 38.7, 5, "3/28");
        Platypus Patty = new Platypus("Platypus", "Patty", true, 12.5, 2, "6/17", "green", false);
        Platypus Perry = new Platypus("Platypus", "Perry", false, 15, 4, "8/09", "green", true);
        Oscar.setHungry(true);
        Patty.setHungry(false);
        Perry.setHungry(true);


        //construct employees
        Employee Elon = new Employee("Elon", "Assistant Manager", 1000000);
        Employee Pete = new Employee();
        Caretaker Tammy = new Caretaker("Tammy", "Caretaker", 90000, "Platypus");
        Caretaker Jennifer = new Caretaker("Jennifer", "Caretaker", 85000, "Ostrich");

        //zoo manager, ask user for action
        boolean managerOpen = true;
        System.out.println("Welcome to the Zoo Manager!");

        while (managerOpen) {
            Scanner s = new Scanner(System.in);
            System.out.println();
            System.out.println("What do you want to check?");
            System.out.println("[A] Check animal & employee profiles");
            System.out.println("[B] Check animal & employee conditions");
            System.out.println("[C] Order employees around");
            System.out.println("[D] Close the Zoo Manager");
            String action = s.nextLine();
            if (action.equalsIgnoreCase("A")) { //check on animals > print all animal info
                Oscar.printProfile();
                Patty.printProfile();
                Perry.printProfile();
                Elon.printProfile();
                Pete.printProfile();
                Tammy.printProfile();
                Jennifer.printProfile();
                System.out.println();
            } else if (action.equalsIgnoreCase("B")) { //check on emps > print all emp info
                Elon.printCondition();
                Pete.printCondition();
                Tammy.printCondition();
                Tammy.printCareData();
                Jennifer.printCondition();
                Jennifer.printCareData();
                System.out.println();
            } else if (action.equalsIgnoreCase("C")) { //order emps around
                System.out.println("Who do you want to order around: Tammy or Jennifer?");
                String emp = s.nextLine();
                System.out.println("Which animal do you want them to feed: Platypus or Ostrich?");
                String animal = s.nextLine();
                if(emp.equals("Tammy")){
                    System.out.println(Tammy.feed(animal));
                } else if(emp.equals("Jennifer")){
                    System.out.println(Jennifer.feed(animal));
                }
                System.out.println();
            } else {
                System.out.println("Zoo Manager CLOSED");
                managerOpen = false;
            }
        }
    }
}