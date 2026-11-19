import java.util.Scanner;

public class Check_num_is_palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();

        Palindrom(0, n,n);
    }
    public  static int Palindrom(int r, int n,int check){
        if(n==0){
            if(check-r==0) System.out.println("Palindrom");
            else System.out.println("not Palindrome");
            return 0;
        }
        return Palindrom(r*10+n%10,n/10,check);
    }

}
