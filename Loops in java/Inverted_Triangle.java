import java.util.Scanner;

public class Inverted_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
