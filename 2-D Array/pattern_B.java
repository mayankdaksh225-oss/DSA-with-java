import java.util.Scanner;

public class pattern_B {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n; j++){
//                if(j == i || j==(n-i)+1 ){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        double sqrt = Math.sqrt(n);
//        System.out.println(sqrt);
        Boolean flag = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);


    }
}
