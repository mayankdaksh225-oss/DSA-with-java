package String_revision;

import java.util.Arrays;

public class String_builder {
    static void main() {
        String s = "Mayank singh";
        char [] arr = s.toCharArray();
        Arrays.sort(arr);

        for(char ele: arr){
            System.out.print(ele+" ");
        }
//        StringBuilder sb = new StringBuilder(s);
//        int i = 0;
//        int j = sb.length()-1;
//        while(i<=j){
//            char ch = sb.charAt(i);
//            sb.setCharAt(i,sb.charAt(j));
//            sb.setCharAt(j,ch);
//            i++;
//            j--;
//        }
//        sb.deleteCharAt(6);
//        sb.insert(6,'&');
//        sb.delete(6,sb.length());
//        System.out.println(sb);

    }
}
