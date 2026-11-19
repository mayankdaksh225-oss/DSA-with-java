import java.util.Scanner;

public class Products_Of_the_digits {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(product(1,n));
    }
    public static int product(int mul ,int n){
        if(n==0) return mul;
        return product(mul*(n%10),n/10);
    }

}
