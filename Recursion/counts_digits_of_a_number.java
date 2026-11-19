import java.util.Scanner;

public class counts_digits_of_a_number {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println( count(0,n,0));
    }
    public static int  count(int r , int n,int cnt){

        if(n==0) return cnt ;
        else cnt++;


        return count(r*10+n%10,n/10,cnt);



    }
}
