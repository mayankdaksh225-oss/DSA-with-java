public class Reverse_String_using_char {
    static void main() {
        String s = "Mayank";

        // by using char Array

//        char [] arr = s.toCharArray();
//        int i = 0; int j = arr.length-1;
//        while(i<j){
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(arr);

        // By using stringBuilder
        String a = "Rahul";
        StringBuilder sb = new StringBuilder(a);
        int i = 0; int  j = sb.length()-1;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);

    }
}
