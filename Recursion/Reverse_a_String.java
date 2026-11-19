public class Reverse_a_String {
    static void main() {
        String s = "Mayank";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0,j=sb.length()-1;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return String.valueOf(sb);
    }

}
