import java.util.ArrayList;

public class Unon {
    static void main() {
        int [] a = {4, 5, 7, 7, 7};
        int [] b = {3, 4, 6, 8};
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length; int m = b.length;
        int  i = 0,j = 0;
        while(i<n && j<m){
            if(i<n-1) {
                while (a[i] == a[i + 1]) i++;
            }
            if(j<m-1) {
                while (b[j] == b[j + 1]) j++;
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
        while (i < n) {
            while (i < n - 1 && a[i] == a[i + 1]) {
                i++;
            }

            ans.add(a[i]);
            i++;
        }

        while (j < m) {
            while (j < m - 1 && b[j] == b[j + 1]) {
                j++;
            }

            ans.add(b[j]);
            j++;
        }
        System.out.println(ans);
    }
}
