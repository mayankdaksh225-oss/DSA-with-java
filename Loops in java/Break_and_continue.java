import java.util.Scanner;

public class Break_and_continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // For Prime number
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        boolean flag = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i == 0) {
                flag = false;
            }
        }
        if(flag == true) System.out.println("prime number");
        else System.out.println("composite number");

    }
}
