import java.util.Scanner;

public class Conversions {
    static void main() {

        Scanner sc = new Scanner(System.in);
        /// Integers to Strings
//        int n = sc.nextInt();
//        String s = "";
//        s=s+n;  // Here we convert number to String
//        System.out.println(s);

        /// By this We can count digits
//        String k = ""+n;
//        System.out.println(k.length());

//        String s = "Raghav";
//        s+="a";
//        System.out.println(s);

        ///If we use double
//        double n = sc.nextDouble();
//        String s = ""+n;
//        System.out.println(s.length());


        ///Strings to Integer by built-in function
//        String num = "9999";
//        int n = Integer.parseInt(num);
//        System.out.println(n+1);

        ///stirng to Character
//
        String s = "Ruhan";
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            arr[0] = 'n';
            System.out.print(arr[i]);
        }

        // With built-in
//        String s = "99999";
//        int n = Integer.parseInt(s);
//        System.out.println(n+1);

        //without built-in
//        String s = "99";
//       int n = Integer.parseInt(s);
       


    }
}
