package String_revision;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers_to_letters {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print((char)arr[i]+" ");
        }
    }
}
