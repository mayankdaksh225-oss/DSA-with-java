import java.util.Arrays;

public class Frequency_of_character {
    static void main() {
        String s = "backspace";



        //// Brute Force Method
//        int maxfreq = Integer.MIN_VALUE;
//        char value = ' ';
//        for(int i = 0; i<arr.length; i++){
//            int freq = 0;
//            for(int j = i; j<arr.length; j++){
//                if(arr[i] == arr[j]) freq++;
//            }
//            if(freq>maxfreq){
//                maxfreq=freq;
//                value = arr[i];
//            }
//        }
//        if(maxfreq==1) System.out.println("no repeating element");
//        else System.out.println(maxfreq+" of "+ value);


        //// Smart approach
        // for minimum frequency
//        char [] arr = s.toCharArray();
//        Arrays.sort(arr);
//        int count = 1;
//        int maxcount = Integer.MAX_VALUE;
//        char ans = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i] == arr[i-1]){
//                count++;
//            }else{
//                if(count<maxcount){
//                    maxcount = count;
//                    ans = arr[i-1];
//                }
//                count = 1;
//            }
//        }
//        if(count<maxcount){
//            maxcount = count;
//            ans = arr[arr.length-1];
//        }
//        System.out.println(ans);

        // For maximum frequency
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        int count = 1;
        int maxcount = Integer.MIN_VALUE;
        char ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if(count>maxcount){
                    maxcount = count;
                    ans = arr[i-1];
                }
                count = 1;
            }
        }
        if(count>maxcount){
            maxcount = count;
            ans = arr[arr.length-1];
        }
        System.out.println(ans);


    }
}
