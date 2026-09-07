import java.util.Scanner;

public class ASCII_with_their_corresponding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int a = 65;
        for(int i = 1; i<=n; i++){
            System.out.print((char)a+" - ");
            System.out.println(a);
            a++;
        }
//        System.out.print("Enter your number: ");
//        int n = input.nextInt();
//        char c = (char)n;
//        System.out.println("ASCII is "+c);

    }
}
