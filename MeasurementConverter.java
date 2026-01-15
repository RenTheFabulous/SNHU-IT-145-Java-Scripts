void main() {
    Scanner scnr = new Scanner(System.in);
    int totalOunces;
    int numGallons;
    int numPints;
    int numOunces;

    //Gets input for ounces total
    IO.println("Enter number of ounces: ");
    totalOunces = scnr.nextInt();

    // Calcs the number of gallons, pints, and ounces
    numGallons = totalOunces / 128;
    numPints = ((totalOunces - (numGallons * 128)) / 16);
    numOunces = (totalOunces - (numGallons * 128) - (numPints * 16)) % 16;

    IO.println("Gallons: " + numGallons);
    IO.println("Pints: " + numPints);
    IO.println("Ounces: " + numOunces);
}