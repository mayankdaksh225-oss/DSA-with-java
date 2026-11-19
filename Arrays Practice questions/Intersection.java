import java.util.ArrayList;

public class Intersection {
    static void main() {
        int [] a = {2,2,2};
        int [] b = {2,2,2};
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0,j=0;
        int n = a.length;
        int m = b.length;
        while(i<n && j<m){
            if(a[i]==b[j] && ans.size()==0 || a[i]==b[j] && ans.get(ans.size()-1) != a[i] ){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println(ans);
    }
}
