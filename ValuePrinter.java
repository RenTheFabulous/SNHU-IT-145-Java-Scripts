// Method to print the product of all numbers in a range of given values
public static void printValue(int rangeStart, int rangeEnd) {
    int product = 1;
    for (int i = rangeStart; i <= rangeEnd; ++i) { //iterates from rangeStart to rangeEnd, multiplying for each num
        product *= i;
    }
    IO.println(product);
}

// Main method:
void main() {
    Scanner scnr = new Scanner(System.in);
    int num1;
    int num2;

    num1 = scnr.nextInt(); //gets inputs for range start and end
    num2 = scnr.nextInt();

    printValue(num1, num2); //calls the method above, prints result
}