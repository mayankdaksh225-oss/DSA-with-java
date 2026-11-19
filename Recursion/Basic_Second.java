import java.util.Scanner;

public class Basic_Second {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        print(x,y);
    }
    public static void print(int x, int y){

        if(x>=y) return;
        System.out.print(y);
        print(x,y-1);
        System.out.print(y);
    }

}
