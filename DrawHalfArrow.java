/* Takes user input for the height and width of the base of a half arrow. Then, takes the user input for the width of
 * the head of the half arrow. If it is not wider than the
 */
void main() {
    Scanner scnr = new Scanner(System.in);
    //Declaring variables
    int arrowBaseH;
    int arrowBaseW;
    int arrowHeadW;

    //Get arrow size specifications
    arrowBaseH = scnr.nextInt();
    arrowBaseW = scnr.nextInt();

    //Checks arrow head width is larger than base width
    do {
        arrowHeadW = scnr.nextInt();
    } while (!(arrowHeadW > arrowBaseW));

    //Creates arrow base
    for (int row = 0; row < arrowBaseH; ++row) {
        for (int column = 0; column < arrowBaseW; ++column) {
            IO.print('*');
        }
        IO.println();
    }

    //Creates arrow head
    for (int i = arrowHeadW; i > 0; --i) {
        for (int j = i; j > 0; --j) {
            IO.print('*');
        }
        IO.println();
    }
}
