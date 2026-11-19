import java.util.Scanner;

public class LCM_of_two_numbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int i = 2; int LCM = 1;

        while(a>1 || b>1){
            if(a%i==0 && b%i==0){
                LCM*=i;
                a/=i;
                b/=i;
            }else if(a%i==0) {
                LCM *= i;
                a=a/i;
            }else if(b%i==0){
                LCM*=i;
                b=b/i;
            }else{
                i++;
            }
        }
        System.out.print("LCM is: "+LCM);
    }
}
