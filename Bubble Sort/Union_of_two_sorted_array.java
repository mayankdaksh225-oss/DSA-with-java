import java.util.ArrayList;

public class Union_of_two_sorted_array {
    static void main() {

        int [] a = {1,1,1,1,1};
        int [] b = {2,2,2,2,2};
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0 ; int m = a.length;
        int j = 0; int n = b.length;
        while(i<m && j<n){
            if(a[i] == a[i+1] && i<m-1){
                while(a[i] == a[i+1] && i<m-1){
                    i++;
                }
            }
            if(b[j] == b[j+1] ){
                j++;
                while(b[j] == b[j+1] && j<n-1 ){
                    j++;
                }
            }
            if(a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }
            if(a[i] != b[j]){
                if(a[i]<b[j]){
                    ans.add(a[i]);
                    i++;
                }else{
                    ans.add(b[j]);
                    j++;
                }
            }
        }
        for(int k = i; k<m; k++){
            ans.add(a[k]);
        }
        for(int l = j; l<n; l++){
            ans.add(a[l]);
        }

        System.out.println(ans);
    }
}
