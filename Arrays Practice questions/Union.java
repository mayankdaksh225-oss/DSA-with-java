import java.util.ArrayList;

public class Union {
    static void main() {
        int []a = {1,1,2,3,4,5,6,7,7};
        int [] b = {0,1,2,3,4,5,5,6,7,7,8,8};
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length; int m = b.length;
        int i = 0,j=0;
        while(i<n && j<m){
            if(i<n-1) {
                while (a[i] == a[i + 1]){
                    i++;
                }
            }
            if(j<m-1) {
                while (b[j] == b[j + 1]){
                    j++;
                }
            }
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            }else{
                ans.add(b[j]);
                j++;
            }
        }
        while(i<n){
            if(i<n-1) {
                while (a[i]==a[i+1]) {
                    i++;
                }
            }
            ans.add(a[i]);
            i++;
        }
        while(j<m){
            if(j<m-1){
                while(b[j]==b[j+1]){
                    j++;
                }
            }
            ans.add(b[j]);
            j++;
        }
        System.out.println(ans);
    }
}
