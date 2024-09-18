import java.util.Scanner;

class CountChange {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int penny;
        int nickel;
        int dime;
        int quarter;
        double total;

        System.out.print("Enter a number of pennies: ");
        penny = scan.nextInt();
        System.out.print("Enter a number of nickels: ");
        nickel = scan.nextInt();
        System.out.print("Enter a number of dimes: ");
        dime = scan.nextInt();
        System.out.print("Enter a number of quarters: ");
        quarter = scan.nextInt();
        total = (0.01 * penny) + (0.05 * nickel) + (0.1 * dime) + (0.25 * quarter);
        System.out.printf("%.2f", total);
        
        }
}
