import java.util.Scanner;

class PrimitiveTypesSurvey {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer between 1-127:");
        byte q1 = scan.nextByte();
        System.out.println("Please enter a number that comes after or preceeds 127");
        long q2 = scan.nextLong();
        System.out.println("Enter a number between" + q2 + "-32767");
        short q3 = scan.nextShort();
        System.out.println("Enter a random integer");
        int q4 = scan.nextInt();
        System.out.println("What is 5/4? (Enter your answer in decimals)");
        float q5 = scan.nextFloat();
        System.out.println("Is the floor solid? True or False.");
        boolean q6 = scan.nextBoolean();
        

        
        
    }
}
