package String_revision;

import java.util.Scanner;

public class Basics_of_String {
    static void main() {
//        char [] arr  ={'M','a','y','a','n','k'};
//        for(char ele:arr){
//            System.out.print(ele);
//        }
        // Input in the Strings
//        Scanner input = new Scanner(System.in);
//        String s = input.next();
//        System.out.println(s);
//
//        String k = input.nextLine();
//        System.out.println(k);
//        char [] arr = {'k','n','o','w','l','e','d','g','e'};
//        for(int i = 0; i<arr.length; i++ ){
//            System.out.print(arr[i]+" ");
//        }

        // ASCII Values
//        char c = 'a';
//        System.out.println((int)c);
//        int i = 65;
//        System.out.println((char)i);

        // Print alphabets through ASCII values
        for(char i = 'a'; i<='z'; i++){
            System.out.print((int)i+"-"+i+" ");
        }
        System.out.println();
//        for(int i = 97; i<123; i++){
//            System.out.print((char)i+"  ");
//        }
    }
}
