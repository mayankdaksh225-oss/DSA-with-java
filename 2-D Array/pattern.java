import java.util.Scanner;

public class pattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
                        for(int j = 1; j<=n; j++){
                            if(j<=i){
                                System.out.print(j);
                            }else{
                                System.out.print(" ");
                            }
                        }
                        for(int k = n; k>=1; k--){
                            if(k<=i){
                                System.out.print(k);
                            }else{
                                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
