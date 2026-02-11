void main() {
    //Initializing variables
    Scanner scnr = new Scanner(System.in);
    String userString;
    String firstWord;
    String lastWord;

    //Introduction text and rules
    IO.println("| Welcome to String Parser! |");
    IO.println("| Strings must be two words, and contain a comma between them |");
    IO.println("| Enter 'q' to quit |");
    IO.println();

    //Loop to handle multiple inputs
    while (true) {
        //Prompting user for input and accepting it
        IO.println("Enter input string: ");
        userString = scnr.nextLine();

        //Checking for quit input
        if (userString.equals("q")) {
            IO.println();
            IO.println("Thanks for using String Parser!");
            IO.println("| Quitting... |");
            break;
        }

        //Loop for validating user input
        while (!userString.contains(",")) {
            IO.println("Error: No comma in string");
            IO.println("Enter input string: ");
            userString = scnr.nextLine();
        }

        //Using string stream to split string into words, splitting at the comma, and then printing them
        Scanner stringScnr = new Scanner(userString);
        stringScnr.useDelimiter(",");

        firstWord = stringScnr.next().trim();
        lastWord = stringScnr.next().trim();

        IO.println();
        IO.println("First word: " + firstWord);
        IO.println("Second word: " + lastWord);
        IO.println();
        IO.println();
    }
}