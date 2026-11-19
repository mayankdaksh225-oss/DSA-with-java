import java.util.Scanner;

public class Power_of_a {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a , int b){
        if(b==0) return 1;
        return  a*pow(a,b-1);
    }

}
