import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int a = input.nextInt();
        System.out.print("B: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A is: "+a);
        System.out.println("B is: "+b);
    }
}
