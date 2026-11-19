import java.util.ArrayList;

public class Set_mismatch {
    static void main() {
        int [] arr = {1,2,2,4};
        int n = arr.length;
//        int [] ans = new int [n];
        ArrayList<Integer>ans = new ArrayList<>();
        int i = 0;
        while(i<n){
            int idx = arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i]){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(int j = 0; j<n; j++){
            if(arr[j]!=j+1){
               ans.add(arr[j]);
               ans.add(j+1);
            }
        }
        System.out.println(ans);
    }
}
