package String_revision;

import java.util.Scanner;

public class Int_to_String {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s=Integer.toString(n);
//        s+=n;
        System.out.println(s);
        System.out.println(s.charAt(4));
    }
}
