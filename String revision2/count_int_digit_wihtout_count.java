package String_revision;

import java.util.Scanner;

public class count_int_digit_wihtout_count {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Int to String
        int n = input.nextInt();
        String s = ""+n;
        System.out.println(s.length());

        // String to int
//        String str = "9999";
//        int p= Integer.parseInt(str);
//        System.out.println(p+1);
        String k = "899";
        int l = Integer.parseInt(k);
        System.out.println(l+2);
    }
}
