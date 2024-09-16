import java.util.Scanner;

class BeforeAndAfter {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Please enter an integer: ");
        num = scan.nextInt();
        System.out.println("The three numbers before " + num + " are: " + (num-1) + " " + (num-2) + " " + (num-3) + ". The three numbers after " + num + " are: " + (num+1) + " " + (num+2) + " " + (num+3) + ".");    }
}
