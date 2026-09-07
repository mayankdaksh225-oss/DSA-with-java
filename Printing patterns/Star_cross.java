import java.util.Scanner;

public class Star_cross {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        int a = 0;int b = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i > ((n/2)+1)){
                    if(j == a-b || j == a+b){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                b++;
                if(j == 1+a || j == n-a){
                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }
            }a++;
            System.out.println();
        }
    }
}
