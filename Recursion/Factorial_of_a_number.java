import java.util.Scanner;

public class Factorial_of_a_number {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==1||n==0) return 1;
        return n*fact(n-1);


    }

}
