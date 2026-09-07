import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
