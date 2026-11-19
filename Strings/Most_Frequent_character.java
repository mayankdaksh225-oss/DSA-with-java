import java.util.Arrays;

public class Most_Frequent_character {
    public static char MostFrequent(String s1){
        char [] arr = s1.toCharArray();
        Arrays.sort(arr);
        int i = 0,j=0; int maxFreq = Integer.MIN_VALUE;
        int n = s1.length();
        char  ans = s1.charAt(0);

        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq =j-i;
                if(freq>maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                i=j;
            }

        }
        int freq = j - i;

        if (freq > maxFreq) {
            maxFreq = freq;
            ans = arr[i];
        }

        return  ans;
    }
    static void main() {
        String s1 = "testsample";
        System.out.println(MostFrequent( s1));

    }
}
