import java.util.ArrayList;

public class lucky_row {
    static void main() {
        int [][] arr = {{3,6},{7,1},{5,2},{4,8}};
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
            if(min>max){
                max = min;
            }
        }
        ans.add(max);
        System.out.println(ans);
    }
}
