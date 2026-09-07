import java.util.Scanner;

public class Name_verification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if(n%5 == 0) System.out.println("Riya ");
        else if(n%3 == 0) System.out.println("Banu");
        else if(n%3 == 0 && n%5 == 0) System.out.println("Apoorva ");
        else if(n%3 != 0 && n%5 != 0) System.out.println("Isha");
    }
}
