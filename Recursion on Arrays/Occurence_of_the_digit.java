import java.util.Scanner;

public class Occurence_of_the_digit {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int p = n;
        int count = 0,ld=0;
        int max = Integer.MIN_VALUE;
        while(p>0){
            p%=10;
            if(p==ld){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max = count;
                ld = p;
                System.out.print(ld);
            }
            n/=10;
            p=n;
        }
        System.out.print(ld);
    }
}
