import java.util.Scanner;

public class sum_is_even_or_odd {
    public static void sum (int x, int y){
        int add = x+y;
        if(add%2==0) System.out.println("Even");
        else System.out.println("Odd");




        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First num: ");
        int a = input.nextInt();
        System.out.print("Enter Second num: ");
        int b = input.nextInt();

        sum(a,b);


    }
}
