import java.util.Scanner;

public class Prime_number {
    public static void prime(int n){
        boolean flag = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0) flag = false;
        }
        if(flag) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        prime(n);
    }
}
