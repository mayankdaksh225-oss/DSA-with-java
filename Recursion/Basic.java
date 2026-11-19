import java.util.Scanner;

public class Basic {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n);
    }
    public static void print(int n ){
        System.out.print(n+" ");
        if(n==1) return;

        print(n-1);
        System.out.print(n+" ");
    }

}
