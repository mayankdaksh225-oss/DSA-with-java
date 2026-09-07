import java.util.Scanner;

public class Greatest_number_Between_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = input.nextInt();
        System.out.print("Enter number B: ");
        int b = input.nextInt();

        System.out.print("Enter number C: ");
        int c = input.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is greatest");
            }else System.out.println(c+" is greatest");
        }else if(b>c){
            System.out.println(b+" is greatest");
        }else System.out.println(c+" is greatest");


    }
}
