import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine
        int fine = calculateFine(daysLate);

        // Display fine or appropriate message
        if (fine == 0) {
            System.out.println("No fine is charged.");
        } else if (fine == -1) {
            System.out.println("Your membership is canceled due to late return after 21 days.");
        } else {
            System.out.println("Fine for returning the book late: Rs. " + fine);
        }

        scanner.close();
    }

    public static int calculateFine(int daysLate) {
        if (daysLate <= 7) {
            return daysLate * 50; // 50 paise per day for the first 7 days
        } else if (daysLate <= 14) {
            return (7 * 50) + ((daysLate - 7) * 100); // Rs. 1 per day for 8-14 days
        } else if (daysLate <= 21) {
            return (7 * 50) + (7 * 100) + ((daysLate - 14) * 500); // Rs. 5 per day after 14 days
        } else {
            return -1; // Membership canceled for returning after 21 days
        }
    }
}
