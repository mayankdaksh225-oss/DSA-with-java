import java.util.Scanner;

public class Armstrong {
    public static void Arms(int count,int n){
        int x = n;
        int check = n;
        int sum = 0;
        while(x>0){
            x%=10;
            int prod = 1;
            for(int i = 1; i<=count; i++){
                 prod = prod*x;
            }
            sum+=prod;
            n/=10;
            x=n;
        }
        if(sum%check == 0) System.out.println("Number is Armstrong");
        else System.out.println("Number is not Armstrong");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int c = n;
        int count = 0;
        int p = n;
        while(p>0) {
            p = p%10;
            count++;
            n/=10;
            p=n;
        }
        Arms(count,c);
    }
}
