// Method to find base area of cylinder returned as double
public static double findBaseArea(double cylinderRadius) {
    return (Math.PI * (cylinderRadius * cylinderRadius));
}
// Method to find volume of cylinder returned as double
public static double findVolume(double cylinderRadius, double cylinderHeight) {
    double baseArea = findBaseArea(cylinderRadius);
    return (baseArea * cylinderHeight);
}
// Main method
void main() {
    //creates scanner object and declares variables
    Scanner scan = new Scanner(System.in);
    double userRadius;
    double userHeight;

    //Prompts user and collects input for calculations
    System.out.println("Enter the radius of the cylinder: ");
    userRadius = scan.nextDouble();
    System.out.println("Enter the height of the cylinder: ");
    userHeight = scan.nextDouble();

    //Outputs
    System.out.println("Radius: " + userRadius);
    System.out.println("Height: " + userHeight);
    System.out.printf("Base area: %.1f\n", findBaseArea(userRadius));
    System.out.printf("Volume: %.1f\n", findVolume(userRadius, userHeight));
}