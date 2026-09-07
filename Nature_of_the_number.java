import java.util.Scanner;

public class Nature_of_the_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float n = input.nextFloat();
        int p = (int)n;
        if(n-p==0) System.out.println("Integer value");
        else System.out.println("Not Integer value");
    }
}
