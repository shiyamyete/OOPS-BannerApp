public class PrintOOPS {
    public static void main(String[] args) {

        // Inline initialization of the array using curly braces
        String[] banner = {
            String.join("   ", "  *** ", "  *** ", " ***** ", " ***** "),
            String.join("   ", " ** **", " ** **", " ** **", " ** "),
            String.join("   ", "** **", "** **", "** ** ", "** "),
            String.join("   ", "** **", "** **", "***** ", " ***** "),
            String.join("   ", "** **", "** **", "** ", "     **"),
            String.join("   ", " ** **", " ** **", "** ", "     **"),
            String.join("   ", "  *** ", "  *** ", "** ", " ***** ")
        };

        // Iterating using an enhanced for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}