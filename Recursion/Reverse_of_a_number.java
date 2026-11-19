import java.util.Scanner;

public class Reverse_of_a_number {
    static void main() {
        Scanner input = new Scanner(System.in);
      int n = input.nextInt();
        System.out.println(reverse(n,0));
    }
    public static int reverse(int n,int r){
        if(n==0){
            return r;
        }
        return reverse(n/10,r*10+n%10);
    }
}
