public class DayOfWeek {
    public static void main(String[] args) {
        // Check if there are exactly 3 command-line arguments
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            System.out.println("Month: 1=January, 2=February, ..., 12=December");
            System.exit(1);
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Compute y0
        int y0 = y - (14 - m) / 12;

        // Compute x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Compute m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Compute d0
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output day of week as integer: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        System.out.println(d0);
    }
}
