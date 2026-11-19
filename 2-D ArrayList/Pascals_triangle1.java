import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascals_triangle1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int  n = input.nextInt();


        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i = 0; i<n; i++){
           a.add(new ArrayList<>());
            for(int j = 0; j<=i; j++){
                a.get(i).add(1);
            }
        }

        for(int i = 0; i<n; i++){
            a.add(new ArrayList<>());
            for(int j = 0; j<=i; j++){
                if(j==0||j==i) {
                    a.get(i).set(j,1);
                }else{
                    int value = a.get(i-1).get(j)+a.get(i-1).get(j-1);
                    a.get(i).set(j,value);
                }
            }
        }
        for(ArrayList<Integer> row : a){
            for(int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
