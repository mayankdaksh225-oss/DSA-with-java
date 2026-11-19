import java.util.Scanner;

public class Print_increasing_and_Decreasing {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(n);

    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

}
