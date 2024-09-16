import java.util.Scanner;

class Average {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double num1;
        double num2;
        double num3;
        double average;

        System.out.println("Please enter any 3 values:");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        average = (num1+num2+num3)/3;
        System.out.println("The average of your values is " + average);
        
        
    }
}
