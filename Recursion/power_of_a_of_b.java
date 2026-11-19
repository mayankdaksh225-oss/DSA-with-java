import java.util.Scanner;

public class power_of_a_of_b {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        power(a,b);
        System.out.println(power(a,b));
    }
    public static int power(int a , int b){
        if(b == 0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
//    public static int power(int a,int b){
//        if(b==0) return 1;
//        return a*power(a,b-1);
//    }

}
