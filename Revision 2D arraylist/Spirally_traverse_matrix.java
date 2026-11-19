import java.util.ArrayList;

public class Spirally_traverse_matrix {
    static void main() {
        int [][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}};
        int fr = 0; int fc = 0;
        int lr = arr.length-1;  int lc = arr[0].length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(fr<=lr && fc<=lc){
            for(int j = fc; j<=lc; j++ ){
                ans.add(arr[fr][j]);
            }fr++;
            for(int i = fr; i<=lr; i++){
                ans.add(arr[i][lc]);
            }lc--;
            for(int j = lc; j>=fc; j--){
                    ans.add(arr[lr][j]);
            }lr--;
            for(int i = lr; i>=fr; i--){
                ans.add(arr[i][fc]);
            }fc++;
        }
        System.out.println(ans);
    }
}
