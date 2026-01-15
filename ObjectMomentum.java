void main() {
    Scanner scnr = new Scanner(System.in);

    // Declaring variables for calcs
    double objectMass;
    double objectVelocity;
    double objectMomentum;

    // Getting the values from user
    IO.println("Enter the mass: ");
    objectMass = scnr.nextDouble();
    IO.println("Enter the velocity: ");
    objectVelocity = scnr.nextDouble();

    //Calculating and outputting result
    objectMomentum = objectMass * objectVelocity;

    System.out.printf("Object momentum is %.3f", objectMomentum);
    IO.println();

}