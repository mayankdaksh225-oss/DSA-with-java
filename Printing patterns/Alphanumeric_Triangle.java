import java.util.Scanner;

public class Alphanumeric_Triangle {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("enter number: ");
        int n = input.nextInt();

        for(int i = 1; i<= n; i++) {
            for(int j = 1; j<=i; j++) {
                if (i%2 == 0){
                    System.out.print((char)(j+64)+" ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
