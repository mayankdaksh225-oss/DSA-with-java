import java.util.Scanner;

public class Reverse_number {
    public static void reverse(int n ){
        int p = n;
        if(p<0){
            p*=-1;
            while(p>0){
                p%=10;
                System.out.print("-"+p);
                n/=10;
                p=n;
            }
        }else{
            while(p>0){
                p%=10;
                System.out.print(p);
                n/=10;
                p=n;
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        reverse(n);
    }
}
