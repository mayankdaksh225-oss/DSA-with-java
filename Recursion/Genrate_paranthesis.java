import java.util.ArrayList;
import java.util.Scanner;

public class Genrate_paranthesis {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> list = new ArrayList<>();
        generate(n,0,0,"",list);
        System.out.println(list);
    }
    public static void generate(int n, int lb, int rb,String s,ArrayList<String> list){
        if(rb==n){
            list.add(s);
            return ;
        }

        if(lb<n) {
            generate(n, lb + 1, rb, s + "(", list);
        }
        if(lb>rb) {
            generate(n, lb, rb + 1, s + ")", list);
        }


    }
}
