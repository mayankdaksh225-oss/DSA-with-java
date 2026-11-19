import java.util.Arrays;

public class Non_repeating_char {
    public static char Nonrep(String s) {
        // code here
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0,j = 0;
        int n = s.length();
        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }else {
                int freq = j-i;
                if(freq==1){
                    return arr[i];
                }
                i=j;
            }
        }
        int freq = j - i;

        if(freq == 1){
            return arr[i];
        }
        return '$';

    }
    static void main() {
        String s = "hheelloo";
        System.out.println( Nonrep(s));
    }
}
