package grazioso;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // Added a method for validating Double input from users during intake questions
    public static double getValidDouble(Scanner scanner) {
        //Loop to force correct input from user
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please input number in decimal format (ex: 1.0): ");
            scanner.next(); // clear invalid input
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // flush buffer
        return value; //"hands back" the proper value
    }

    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();
        String menuSelection = "";
        Scanner scnr = new Scanner(System.in);

        // Menu loop--Displays menu information, takes input and connects to action
        while (!menuSelection.equalsIgnoreCase("q")) {
            displayMenu();
            menuSelection = scnr.nextLine().toLowerCase().trim();

            switch (menuSelection) {
                case "1":
                    intakeNewDog(scnr);
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAnimals("available");
                    break;
                case "q":
                    System.out.println("Exiting Menu.");
                    break;
                default:
                    System.out.println("Invalid menu selection, please try again.");
                    break;
            }
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection: ");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6",
                "05-12-2019", "United States", "intake", false,
                "United States");

        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2",
                "02-03-2020", "United States", "Phase I", false,
                "United States");

        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6",
                "12-12-2019", "Canada", "in service", true,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Chips", "female", "2", "4.2",
                "02-01-2025", "United States", "in service",
                false, "United States", 3.5, 12.1,
                6.1, "macaque");

        monkeyList.add(monkey1);
    }

    /* Method for intake process for new dogs.
     *
     * Asks user input, validates dog is new, prompts/adds dog info, then creates new dog object and adds to list */
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");

        // Validates if dog already exists inside the list
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("Please enter the dog's breed: ");
        String breed = scanner.nextLine();

        System.out.println("Please enter the dog's gender: ");
        String gender = scanner.nextLine();

        System.out.println("Please enter the dog's age: ");
        String age = scanner.nextLine();

        System.out.println("Please enter the dog's weight: ");
        String weight = scanner.nextLine();

        System.out.println("Please enter the dog's acquisition date: ");
        String acquisitionDate = scanner.nextLine();

        System.out.println("Please enter the dog's acquisition location: ");
        String acquisitionLocation = scanner.nextLine();

        System.out.println("Please enter the dog's training status: ");
        String trainingStatus = scanner.nextLine();

        // Added code to ensure that the input matched true/false so that there was no crash
        System.out.println("Please enter if the dog is reserved: ");
        String reservedInput = scanner.nextLine().toLowerCase().trim();
        while(!reservedInput.equalsIgnoreCase("true") &&
              !reservedInput.equalsIgnoreCase("false")) {
            System.out.println("Invalid input. Please try again.");
            reservedInput = scanner.nextLine().toLowerCase().trim();
        }
        boolean reserved = Boolean.parseBoolean(reservedInput);

        System.out.println("Please enter the dog's in-service country: ");
        String inServiceCountry = scanner.nextLine();

        // Takes information entered by user to create a new instance of a dog object. Then, adds to list of dogs.
        Dog newDog = new Dog(
                name,
                breed,
                gender,
                age,
                weight,
                acquisitionDate,
                acquisitionLocation,
                trainingStatus,
                reserved,
                inServiceCountry
        );
        dogList.add(newDog);
    }

        /* Method for intake process for new monkeys.
         *
         * Asks user input, validates monkey is new, prompts/adds monkey info, then creates new monkey object and adds
         * to list. Additionally, validates monkey species is contained within the accepted species listed by company */
        public static void intakeNewMonkey(Scanner scanner) {
            ArrayList<String> speciesList = new ArrayList<>();
            speciesList.add("capuchin");
            speciesList.add("guenon");
            speciesList.add("macaque");
            speciesList.add("marmoset");
            speciesList.add("squirrel monkey");
            speciesList.add("tamarin");

            System.out.println("What is the monkey's name?");

            // Validates if monkey already exists inside the list
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            // Add the code to instantiate a new monkey and add it to the appropriate list
            System.out.println("Please enter the monkey's gender: ");
            String gender = scanner.nextLine();

            System.out.println("Please enter the monkey's age: ");
            String age = scanner.nextLine();

            System.out.println("Please enter the monkey's weight: ");
            String weight = scanner.nextLine();

            System.out.println("Please enter the monkey's acquisition date: ");
            String acquisitionDate = scanner.nextLine();

            System.out.println("Please enter the monkey's acquisition location: ");
            String acquisitionLocation = scanner.nextLine();

            System.out.println("Please enter the monkey's training status: ");
            String trainingStatus = scanner.nextLine();

            // Added code to ensure that the input matched true/false so that there was no crash
            System.out.println("Please enter if the monkey is reserved: ");
            String reservedInput = scanner.nextLine().toLowerCase().trim();
            while(!reservedInput.equalsIgnoreCase("true") &&
                    !reservedInput.equalsIgnoreCase("false")) {
                System.out.println("Invalid input. Please try again.");
                reservedInput = scanner.nextLine().toLowerCase().trim();
            }
            boolean reserved = Boolean.parseBoolean(reservedInput);

            System.out.println("Please enter the monkey's in-service country: ");
            String inServiceCountry = scanner.nextLine();

            System.out.println("Please enter the monkey's tail length: ");
            double tailLength = getValidDouble(scanner);

            System.out.println("Please enter the monkey's height: ");
            double height = getValidDouble(scanner);

            System.out.println("Please enter the monkey's body length: ");
            double bodyLength = getValidDouble(scanner);

            System.out.println("Please enter the monkey's species: ");
            String species = scanner.nextLine().toLowerCase();
            // Validates species input
            while (!speciesList.contains(species)) {
                System.out.println("Invalid species. Please enter a valid monkey species: ");
                species = scanner.nextLine().toLowerCase();
            }

            // Takes information entered by user to create a new instance of a monkey object and add it to list.
            Monkey newMonkey = new Monkey(
                    name,
                    gender,
                    age, weight,
                    acquisitionDate,
                    acquisitionLocation,
                    trainingStatus,
                    reserved,
                    inServiceCountry,
                    tailLength,
                    height,
                    bodyLength,
                    species
            );
            monkeyList.add(newMonkey);
        }

        /* Reserve Animal Method:
         *
         * Takes user input to check animal type and service country. Searches list for unreserved criteria matches.
         * If no matches are found, displays a message informing the user. */
        public static void reserveAnimal(Scanner scanner) {
            boolean animalFound = false;

            System.out.println("To reserve an animal, first please enter the desired animal type: ");
            String animalType = scanner.nextLine().toLowerCase();

            while(!animalType.equalsIgnoreCase("dog") && !animalType.equalsIgnoreCase("monkey")) {
                System.out.println("Invalid animal type. Please enter a valid animal type: ");
                animalType = scanner.nextLine().toLowerCase();
            }

            System.out.println("Enter the in-service country: ");
            String inServiceCountry = scanner.nextLine().toLowerCase();

            // Searches for animal within ArrayList based on criteria of country, reservation, and training statuses
            if (animalType.equalsIgnoreCase("dog")) {
                for(Dog dog: dogList) {
                    if(dog.getReserved() == false
                       && dog.getInServiceCountry().equalsIgnoreCase(inServiceCountry)
                       && dog.getTrainingStatus().equalsIgnoreCase("in service")) {

                        System.out.println("Found and reserved animal! Success!");
                        dog.setReserved(true);
                        animalFound = true;
                        break;
                    }
                }
            }
            else if (animalType.equalsIgnoreCase("monkey")) {
                for(Monkey monkey: monkeyList) {
                    if(monkey.getReserved() == false
                       && monkey.getInServiceCountry().equalsIgnoreCase(inServiceCountry)
                       && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {

                        System.out.println("Found and reserved animal! Success!");
                        monkey.setReserved(true);
                        animalFound = true;
                        break;
                    }
                }
            }
            // If no matches are found, prints a message to user
            if (!animalFound) {
                System.out.println("Sorry, no available " + animalType + " in " + inServiceCountry + " were found.");
            }
        }

        /* Print Animals Method:
         *
         * Includes the animal name, status, acquisition country and if the animal is reserved.
         * This method connects to three different menu items. Thus, there are 3 different potential outputs. */
        public static void printAnimals(String listType) {
            // Selecting list type to print using if and else if clauses
            // Dog List
            if (listType.equalsIgnoreCase("dog")) {
                System.out.println("List of Dogs:");
                for(Dog dog: dogList) {
                    System.out.println("Name: " +  dog.getName() + " | " +
                                       "Training Status: " + dog.getTrainingStatus() + " | " +
                                       "Reserved: " + dog.getReserved());
                }
            }
            // Monkey List
            else if (listType.equalsIgnoreCase("monkey")) {
                System.out.println("List of Monkeys:");
                for(Monkey monkey: monkeyList) {
                    System.out.println("Name: " + monkey.getName() + " | " +
                                       "Training Status: " + monkey.getTrainingStatus() + " | " +
                                       "Reserved: " + monkey.getReserved());
                }
            }
            // Available List
            else if (listType.equalsIgnoreCase("available")) {
                // Lists both types of animal based on check of training status and reservation status
                System.out.println("List of Available Animals:");
                for(Dog dog: dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service")
                        &&  dog.getReserved() == false) {
                        System.out.println("Name: " +  dog.getName() + " | " +
                                           "Training Status: " + dog.getTrainingStatus() + " | " +
                                           "Reserved: " + dog.getReserved());
                    }
                }
                for(Monkey monkey: monkeyList) {
                if (monkey.getTrainingStatus().equalsIgnoreCase("in service")
                    &&  monkey.getReserved() == false) {
                        System.out.println("Name: " + monkey.getName() + " | " +
                                           "Training Status: " + monkey.getTrainingStatus() + " | " +
                                           "Reserved: " + monkey.getReserved());
                    }
                }
            }
        }
}