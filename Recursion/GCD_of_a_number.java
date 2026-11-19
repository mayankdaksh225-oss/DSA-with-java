import java.util.Scanner;

public class GCD_of_a_number {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i = Math.min(a,b); i>=1; i--){
            if(a%i == 0 && b%i ==0){
                System.out.println(i);
                break;
            }

        }
    }
}
