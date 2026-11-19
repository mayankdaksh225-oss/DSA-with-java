import java.util.Scanner;
public class Basic3 {
    static void main() {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        print(n);
    }
    public static int print(int n ){
        if(n==0) return 1;
        System.out.print(n+" ");
        int ans = print(n-1);
        System.out.print(n*2+" ");
        return ans;

    }
}
