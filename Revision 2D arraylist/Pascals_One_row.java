import java.util.ArrayList;

public class Pascals_One_row {
    static void main() {
        int n = 4;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr.add(new ArrayList<>());
            for(int j = 0; j<=i; j++){
                if(j==0 || j==i){
                    arr.get(i).add(1);
                }else{
                    int value = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                    arr.get(i).add(value);
                }
            }
            for(ArrayList<Integer> row:arr){
                for(int ele:row){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
            int a = n-1;
            ArrayList<Integer> b = new ArrayList<>();
            for(int k = 0; k<n; k++){
                int add = arr.get(a).get(k);
                b.add(add);
            }
            System.out.println(b);
        }

    }
}
