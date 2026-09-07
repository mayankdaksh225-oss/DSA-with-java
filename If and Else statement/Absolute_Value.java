import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
//        int n = input.nextInt();
//        if(n>=0) System.out.println(n);
//        else System.out.println(n*(-1));
        String name = input.nextLine();
        System.out.println("Good morning "+name);
    }
}
