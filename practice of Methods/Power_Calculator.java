import java.util.Scanner;

public class Power_Calculator {
    public static int power(int x, int y){
        int p = 1;
        for(int i = 1; i<=y; i++){
             p = p*x;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b = input.nextInt();
        System.out.print("Enter Exponent: ");
        int e = input.nextInt();
        power(b,e);
        System.out.println("Power is: "+power(b,e));
    }
}
