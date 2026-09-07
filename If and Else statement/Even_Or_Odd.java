import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        if(n%2 == 0 ) System.out.print("This is Even number ");
        else System.out.print("This is odd number");
    }
}
