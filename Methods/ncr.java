import java.util.Scanner;

public class ncr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("enter number: ");
//        int n = input.nextInt();
//        int a = 1;
//        for(int i = 1; i<=n; i++){
//            a = a*i;
//        }
//        System.out.println("Factorial is: "+ a);

        // NCR KI VALUE NIKALI IS METHOD SE
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();
//
//        int nfact = 1;
//        int rfact = 1;
//        int nrfact = 1;
//        for(int i = 1; i<=n; i++){
//            nfact *= i;
//        }
//
//        for(int i = 1; i<=r; i++){
//            rfact *= i;
//        }
//
//        for(int i = 1; i<=n-r; i++){
//            nrfact *= i;
//        }
//
//        int ncr = nfact/(rfact*nrfact);
//        System.out.println(" nCr is: "+ ncr);


        // AB NCR KI VALUE NIKALENGE SIRF EK FUNCTION SE

        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println("nCr is: "+ncr);
        int npr = fact(n)/fact(n-r);

        System.out.println("nPr is: "+npr);

    }
    public static int fact(int x){
        int fact = 1;
        for(int i = 1; i<= x; i++){
            fact *= i ;

        }
        return fact;
    }
}
