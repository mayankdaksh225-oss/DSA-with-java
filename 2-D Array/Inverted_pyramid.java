import java.util.Scanner;

public class Inverted_pyramid {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<i; k++){
                System.out.print(" ");
            }
            for(int j = i+(i-1); j<=n+(n-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
