import java.util.ArrayList;

public class Array_leaders {
    static void main() {
        int [] arr = {16,17,4,3,5,2};
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
           if(arr[i]>=max){
               max = arr[i];
               ans.add(max);
           }
        }
        // Reverse code
        int c = ans.size();
        int a = 0; int b = c-1;
        while(a<=b){
            int temp = ans.get(a);
            ans.set(a,ans.get(b));
            ans.set(b,temp);
            a++;
            b--;

        }
        System.out.println(ans);
    }
}

