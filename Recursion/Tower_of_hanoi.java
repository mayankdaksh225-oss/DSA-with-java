import java.util.Scanner;

public class Tower_of_hanoi {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        hanoi(n,'a','b','c');
    }
    public static void hanoi(int n, char sr, char help, char dest){
        if(n==0){
            return;
        }
        hanoi(n-1,sr,dest,help);
        System.out.println(sr+"->"+dest);
        hanoi(n-1,help,sr,dest);
    }
}
