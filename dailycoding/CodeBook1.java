import java.util.Scanner;

class CodeBook1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 4 digit nuymber greater than 999");
        int digits= scan.nextInt();
        System.out.println("Enter a 4 letter word");
        String word = scan.next();

        int firstNumber = digits/1000;
        int lastNumber = digits%10;
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(3);
        boolean check1;
        boolean check2;
        
        System.out.println(firstNumber + " | " + lastNumber + " | " + firstLetter + " | " + lastLetter);

        if (firstNumber == lastNumber) {
            System.out.println(true);
            check1 = true;
        } else {
            System.out.println(false);
            check1 = false;
        }

        if (firstLetter == lastLetter) {
            System.out.println(true);
            check2 = true;
        } else {
            System.out.println(false);
            check2 = false;
        }

        if (check1 && check2 == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        close.scan();
    }
}
