import java.util.Scanner;

public class Four_digit_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no.: ");
        int n = input.nextInt();
        if(n>999 && n<10000) System.out.println("four digit number");
        else System.out.println("This is not four digit number");
    }
}
