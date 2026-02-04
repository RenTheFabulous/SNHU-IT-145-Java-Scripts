/* This program finds the largest number out of a list of user-given values.
 * It takes an input for the amount of numbers to check, and inputs for each number to check.
 */
void main() {
    // Initializing scanner and variables
    Scanner scnr = new Scanner(System.in);
    int inputCount;
    int inputValue;
    int largestVal = 0;
    int i;

    //Get amount of nums to check
    System.out.println("Enter the amount of numbers to check:");
    inputCount = scnr.nextInt();

    //Loop to iterate over each user number and re-prompt for new input
    for (i = inputCount; i >= 1; --i) {
        System.out.println("Enter a number:");
        inputValue = scnr.nextInt();
        IO.println("Value read: " + inputValue);
        if (i == inputCount) {
            largestVal = inputValue;
        }
        if (inputValue > largestVal) {
            largestVal = inputValue;
        }
    }

    IO.println("Largest number read: " + largestVal);
}