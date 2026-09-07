import java.util.Scanner;

public class Floyd_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int a = 1;

        for(int i = 0; i<n; i++ ){
            for(int j = 1; j<=i+1; j++){

                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
