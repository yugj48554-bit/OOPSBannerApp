public class oopsbannerapp{
     public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", " *** ", " **** ", " **** "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", " **** ", " ***  "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", " *** ", " *** ", "*     ", " **** ")
        };

        // Enhanced for-loop to print each banner line
        for (String line : lines) {
            System.out.println(line);}
	}
}