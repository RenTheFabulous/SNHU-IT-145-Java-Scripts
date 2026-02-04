void main() {
    Scanner scnr = new Scanner(System.in);
    String userText;
    int charCount = 0;

    userText = scnr.nextLine();  // Gets entire line, including spaces.

    // Loops over the length of input and checks each character one by one, updating counter
    for (int i = 0; i < userText.length(); ++i) {
        int temp = userText.charAt(i);
        if ((temp != ' ') && (temp != '.') && (temp != '!') && (temp != ',')) {
            charCount++;
        }
    }

    IO.println(charCount);
}
