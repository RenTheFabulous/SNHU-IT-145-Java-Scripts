/* Name: Ren Bodnar
 * Assignment: IT 145—Module Two
 * Description: I have created code to implement a "PetBag.Cat" class that has two constructors, and a "getter" and "setter"
 * for the "catSpaceNumber" private field.
 */
package PetBAG;

//Defines Cat class
public class Cat {
    //Declaring a field for the space number
    private int catSpaceNumber;

    //No args constructor method
    public Cat() {
        catSpaceNumber = 0;
    }

    //Constructor method with args
    public Cat(int initialSpaceNumber) {
        catSpaceNumber = initialSpaceNumber;
    }

    //Method to get the cat space number (accessor)
    public int getCatSpaceNumber() {
        return this.catSpaceNumber;
    }

    //Method to set cat space number (mutator)
    public void setCatSpaceNumber(int inputSpaceNumber) {
        this.catSpaceNumber = inputSpaceNumber;
    }
}