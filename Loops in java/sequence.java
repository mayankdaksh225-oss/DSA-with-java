import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
         int a = 0;
        for(int i = 1; i<=n; i++) {

            System.out.print(i + " ");
            System.out.println(n - a);
            a++;
        }


    }
}
