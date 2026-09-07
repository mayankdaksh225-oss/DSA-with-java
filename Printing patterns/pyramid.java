import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        int a = 0;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=i+a; k++){
                System.out.print("* ");
            }
            System.out.println();
            a++;
        }
    }
}
