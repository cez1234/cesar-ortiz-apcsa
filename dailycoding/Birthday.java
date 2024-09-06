import java.util.Scanner;

class Birthday {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int year;
        int day;
        int month;

        System.out.println("Please enter the following data in numerical values:");
        System.out.println("What year were you born?");
        year = scan.nextInt();
        System.out.println("What month were you born?");
        month = scan.nextInt();
        System.out.println("What day were you born?");
        day = scan.nextInt();

        System.out.print("You were born on " + month + "/" + day + "/" + year);
    }
}