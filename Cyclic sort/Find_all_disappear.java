import java.util.ArrayList;

public class Find_all_disappear {
    static void main() {
        ArrayList<Integer> ans = new ArrayList<>();
        int [] arr = {4,3,2,7,8,2,3,1};
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int index = arr[i]-1;
            if(arr[i]==i+1||arr[index]==arr[i]){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for(int j = 1; j<n; j++){
            if(arr[j]==j+1||arr[j]!=j+1){
                if(arr[j-1]!=j){
                    ans.add(j);
                }
            }
        }
        System.out.println(ans);
    }
}
