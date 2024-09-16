import java.util.Scanner;

class DaysToMinutes {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int days;
        int mins;

        System.out.println("Enter a number of days: ");
        days = scan.nextInt();
        mins = days * 24 * 60;
        System.out.println("There are " + mins + " minutes in " + days + " days.");
    }
}
