import java.util.Scanner;

public class Alphabets_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: " );
        int n = input.nextInt();

        for(int i = 1; i<=n; i++ ){
            for(int j = 65; j<= 65+n; j++ ){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
