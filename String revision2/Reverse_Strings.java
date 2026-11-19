package String_revision;

import java.util.Scanner;

public class Reverse_Strings {
    static StringBuilder reversekardo(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0; int j = sb.length()-1;
        while(i<=j){
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
        return sb;
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String s = input.nextLine();


        System.out.println(reversekardo(s));

    }
}
