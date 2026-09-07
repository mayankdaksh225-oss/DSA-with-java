import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you student (true/false): ");
        boolean name = input.nextBoolean();
        if(name== true) System.out.println("Welcome in the clg");
        else System.out.println("No seat");
    }
}
