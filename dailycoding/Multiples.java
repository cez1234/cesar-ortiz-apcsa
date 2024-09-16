import java.util.Scanner;

class Multiples {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in );
        int num;
        System.out.println("Input an integer between 1-10");
        num = scan.nextInt();
        System.out.println("The multiples of " + num + " are: " + num + " " + (num*num) + " " + (num*num*num) + " " + (num*num*num*num) + " " + (num*num*num*num*num));
    }
}