/* Name: Ren Bodnar
 * Assignment: IT-145
 * Description: As per the UML diagram, I have implemented the private attributes and public methods specified.
 * I included mutators and accessors for each attribute, and took into consideration what data type might best suit
 * each one. I also included an empty constructor that initializes all attributes to zero (or zero equivalent) values,
 * as well as a constructor with arguments so that an instance of the pet class could be created with non-zero values.
 */
package PetBAG; // I went ahead and added it to a package for linking it later with the other parts of the program

public class Pet {
    //Class attributes
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    //Empty constructor
    public Pet() {
        this.petType = "";
        this.petName = "";
        this.petAge = 0;
        this.dogSpaces = 0;
        this.catSpaces = 0;
        this.daysStay = 0;
        this.amountDue = 0.0;
    }
    //Constructor that contains arguments
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay,
               double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }
    // Pet type accessor (returns pet type info)
    public String getPetType() {
        return this.petType;
    }
    // Pet type mutator (modifies pet type info)
    public void setPetType(String inputPetType) {
        this.petType = inputPetType;
    }
    // Pet name accessor (returns pet name info)
    public String getPetName() {
        return this.petName;
    }
    // Pet name mutator (modifies pet name info)
    public void setPetName(String inputPetName) {
        this.petName = inputPetName;
    }
    // Pet age accessor (returns pet age info)
    public int getPetAge() {
        return this.petAge;
    }
    // Pet age mutator (returns pet age info)
    public void setPetAge(int inputPetAge) {
        this.petAge = inputPetAge;
    }
    // Dog spaces accessor (returns number of dog spaces)
    public int getDogSpaces() {
        return this.dogSpaces;
    }
    // Dog spaces mutator (modifies number of dog spaces)
    public void setDogSpaces(int inputDogSpaces) {
        this.dogSpaces = inputDogSpaces;
    }
    // Cat spaces accessor (returns number of cat spaces)
    public int getCatSpaces() {
        return this.catSpaces;
    }
    // Cat spaces mutator (modifies number of cat spaces)
    public void setCatSpaces(int inputCatSpaces) {
        this.catSpaces = inputCatSpaces;
    }
    // Days stay accessor (returns number of days pet is staying)
    public int getDaysStay() {
        return this.daysStay;
    }
    // Days stay mutator (modifies number of days pet is staying)
    public void setDaysStay(int inputDaysStay) {
        this.daysStay = inputDaysStay;
    }
    // Amount due accessor (returns how much is owed for pet services)
    public double getAmountDue() {
        return this.amountDue;
    }
    // Amount due mutator (modifies amount due for pet services)
    public void setAmountDue(double inputAmountDue) {
        this.amountDue = inputAmountDue;
    }
}