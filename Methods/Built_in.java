import java.util.Scanner;
public class Built_in {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(3));
//        System.out.println(Math.cbrt(999));
//        System.out.println(Math.floor(-8.0005));
//        System.out.println(Math.ceil(-9.4));
//        System.out.println(Math.min(5.4,4));
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int a = input.nextInt();
        System.out.print("B: ");
        int b = input.nextInt();
        System.out.print("C: ");
        int c = input.nextInt();
        System.out.print("D: ");
        int d = input.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
