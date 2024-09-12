import java.util.Scanner;

class Trapezoid {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double h;
        double area;

        System.out.println("Hello, this is a calculator for the area of a trapezoid. Please enter the values for the following variables:");
        System.out.println("Side #1:");
        a = scan.nextDouble();
        System.out.println("Side #2:");
        b = scan.nextDouble();
        System.out.println("Height:");
        h = scan.nextDouble();
        area = (((a+b)/2)*h);
        System.out.print("The area of your trapezoid is: " + area);


    }
}
