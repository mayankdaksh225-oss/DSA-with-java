import java.util.Scanner;

public class count_Digit {
    public static int count(int n){
        int cnt = 0;
        int p = n;
        while(p>0){
           p%=10;
           cnt++;
           n/=10;
           p=n;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = count(n);
        System.out.println(result+" Digit number");
    }
}
