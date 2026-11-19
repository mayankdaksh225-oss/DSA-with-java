import java.util.Scanner;

public class Print_A {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 1;i<=n; i++){
            if(i==1){
                for(int j = 1; j<=n; j++){
                    if(j==1 || j==n){
                        System.out.print("  ");
                    }else {
                        System.out.print("* ");
                    }
                }
            }else{
                if(i==n/2+1){
                    for(int j =1; j<=n; j++){
                        System.out.print("* ");
                    }
                }else{
                    for(int j = 1; j<=n; j++){
                        if(j==1 || j==n){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
