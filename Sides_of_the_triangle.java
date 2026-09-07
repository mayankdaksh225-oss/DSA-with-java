import java.util.Scanner;

public class Sides_of_the_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.print("Enter Side A: ");
        int a = input.nextInt();

        System.out.print("Enter Side B: ");
        int b = input.nextInt();

        System.out.print("Enter Side C: ");
        int c = input.nextInt();

        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid triangle Formed ");
        }else{
            System.out.println("triangle cannot formed by these sides");
        }


    }
}
