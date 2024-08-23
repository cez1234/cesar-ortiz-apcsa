import java.util.Scanner;

class FirstMidLast {
   
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String val1;
        String val2;
        String val3;
        String val4;
        String val5;
    
        System.out.println("Enter five values");

        val1 = scan.nextLine();
        val2 = scan.nextLine();
        val3 = scan.nextLine();
        val4 = scan.nextLine();
        val5 = scan.nextLine();

        System.out.print("First(" + val1 + ") Middle(" + val3 + ") + Last(" + val5 + ")");



    }

}
