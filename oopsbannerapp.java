public class oopsbannerapp{
     public static void main(String[] args) {

        // Define String Array to hold the OOPS banner lines
        String[] lines = new String[7];

        // Populate each line using String.join()
        lines[0] = String.join(" ", "  *  ", "  *  ", "** ", " *** ");
        lines[1] = String.join(" ", " *  *", " *  *", "*   *", "**     ");
        lines[2] = String.join(" ", "*    *", "*    *", "*   *", "**     ");
        lines[3] = String.join(" ", "*    *", "*    *", "** ", " *** ");
        lines[4] = String.join(" ", "*    *", "*    *", "*     ", "     *");
        lines[5] = String.join(" ", " *  *", " *  *", "*     ", "     *");
        lines[6] = String.join(" ", "  *  ", "  *  ", "*     ", " ** ");

        // Use for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}