import java.util.ArrayList;
import java.util.Scanner;

public class Pascals_trikon {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i<n; i++ ){
            ArrayList<Integer> a = new ArrayList<>();
            arr.add(a);
            for(int j = 0; j<=i; j++){
                if(j==0 || j == i){
                   arr.get(i).add(1);
                }else{
                    int value = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                    arr.get(i).add(value);
                }
            }
        }

//        for(ArrayList<Integer> row:arr){
//            for(int ele:row){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
