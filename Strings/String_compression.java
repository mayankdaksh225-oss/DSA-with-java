import java.util.ArrayList;

public class String_compression {
    public static String compress(String chars) {
        char [] arr = chars.toCharArray();
        int i = 0,j=0; int n = chars.length();
        ArrayList<String> ans = new ArrayList<>();

        while(j<n){

            if(arr[i]==arr[j]) j++;
            else {
                int freq = j-i;

                ans.add(String.valueOf(arr[i]));
                ans.add(String.valueOf(freq));

                i=j;
            }

        }
        int freq = j-i;

        ans.add(String.valueOf(arr[i]));

        ans.add(String.valueOf(freq));
        return String.valueOf(ans);
    }
    static void main() {
        String s = "aabbccc";
        System.out.println(compress(s));
    }
}
