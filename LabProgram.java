/* Gets input of a sentence (string) and iterates over it to output character count, excluding spaces, periods,
 * exclamation points, commas.
 */
void main() {
    Scanner scnr = new Scanner(System.in);
    String userText;
    int charCount = 0;

    userText = scnr.nextLine();  // Gets entire line, including spaces.

    //Loop to iterate over string
    for (int i = 0; i < userText.length(); ++i) {
        int temp = userText.charAt(i);
        if ((temp != ' ') && (temp != '.') && (temp != '!') && (temp != ',')) { //Checks it against these, increments
            charCount++;
        }
    }

    IO.println(charCount); //outputs count
}
