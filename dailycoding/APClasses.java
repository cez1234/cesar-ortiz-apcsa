import java.util.Scanner;

class APClasses {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int numClasses;
        String classes;

        System.out.println("How many classes are you taking?");
        numClasses = scan.nextInt();
        scan.nextLine();
        System.out.println("What classes are you taking?");
        classes = scan.nextLine();
        System.out.println("You are taking " + numClasses + " classes. These classes are " + classes + ".");
    }
}
